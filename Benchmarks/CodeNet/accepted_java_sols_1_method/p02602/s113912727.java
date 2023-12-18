import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int num[] = new int[N];
      for(int i=0;i<N;i++){
        num[i] = sc.nextInt();
      }
      for(int i=K;i<N;i++){
        //System.out.print(num[i-K]+":"+num[i]);
        if(num[i-K]<num[i]){
          System.out.println("Yes");
        }else{
        System.out.println("No");
      	}
      }
  }
}