import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int A =sc.nextInt();
      int B =sc.nextInt();
      int C =sc.nextInt();
      int K =sc.nextInt();
      
      for(int i=1; i<=K; i++){
      if(K-A==0){
      System.out.println(A*1);
        return;
      }
        if(K-A<0){
        System.out.println(K*1);
          return;
        }
        if((K-A)-B<=0){
         System.out.println(A*1+B*0);
          return;
        }
        if((K-A)-B>0){
        System.out.println(A*1+B*0+(((K-A)-B)*(-1)));
          return;
        }
      }
    }
}