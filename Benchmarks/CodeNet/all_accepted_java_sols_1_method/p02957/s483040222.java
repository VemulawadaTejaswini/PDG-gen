import java.util.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();

       int K = (A+B)/2;
       if((A+B)%2==1) {
           System.out.print("IMPOSSIBLE");
    	   
       }else {
           System.out.print(K);
    	   
       }
       
   }
}
