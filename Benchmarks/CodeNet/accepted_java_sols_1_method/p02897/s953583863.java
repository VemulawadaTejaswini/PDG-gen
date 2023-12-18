import java.util.*;

public class Main {
	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   
     double N = sc.nextInt ();
   if(N % 2 == 0) {
       double a = (N/2) / N;
	   System.out.println(a);
   }else {       
       double a = ((N+1)/2) / N;
	   System.out.println(a);
   }
   
   }
}
