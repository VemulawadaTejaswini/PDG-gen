import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<N;i++){
      list.add(scan.nextInt());
    }
    Collections.reverse(list);
    int count=0;
    int max=count;
      for(int j=0;j<N-1;j++){
        if(list.get(j)<=list.get(j+1)){
          count++;
        }else{
          count=0;
        }
        if(max<count){
          max=count;
      }
    }
    System.out.println(max);
  }
}