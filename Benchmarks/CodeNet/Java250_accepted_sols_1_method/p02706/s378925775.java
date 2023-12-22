import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    for(int i=0; i<M; i++){
      N -= sc.nextInt();
      if(N<0){
        System.out.print("-1");
        return;
      }
    }
    System.out.print(N);
  }
}
