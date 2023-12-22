import java.util.*;
//http://kazune-lab.net/contest/2019/07/14/agc035/
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<Integer> hashset = new HashSet<Integer>();
    int N = sc.nextInt();
    int array[] = new int[N];
    for (int i=0;i<N;i++){
      int a = sc.nextInt();
      hashset.add(a);
      array[i] = a;
    }
    List<Integer> list = new ArrayList<Integer>(hashset);
    String ans = "No";
    if(N%3 != 0){
      if (list.size() == 1 && list.get(0) == 0){
          ans ="Yes";
      }
    }else{
      if (list.size() == 1){
        if (list.get(0) == 0){
          ans ="Yes";
        }
      }else if(list.size() == 2){
        int a = 0;
        int b = 0;
        for (int i=0;i<N;i++){
         if (array[i] == list.get(0)){
           a++;
         }else{
           b++;
         }
        }
        if (a == N/3){
          ans = "Yes";
        }
      }else if(list.size() == 3){
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i=0;i<N;i++){
         if (array[i] == list.get(0)){
           a++;
         }else if(array[i] == list.get(1)){
           b++;
         }else{
           c++;
         }
         }
       if((a==b)&&(b==c)){
         if ((list.get(0)^list.get(1)^list.get(2)) == 0){
           ans = "Yes";
         }
       }
      }
    }
    
    System.out.println(ans);
  }
}