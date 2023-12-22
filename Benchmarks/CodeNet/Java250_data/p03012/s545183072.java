import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<N; i++){
      list.add(sc.nextInt());
    }
    int total = 0;
    while(N > 0){
      if(total > 0){
        total -= list.get(list.size()-1);
        list.remove(list.size()-1);
      }else{
        total += list.get(0);
        list.remove(0);
      }
      N--;
    }
    if(total < 0){
      total = Math.abs(total);
    }
    System.out.println(total);
  }
}
