import java.util.*;

public class Main{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		long A =sc.nextLong();
		long B =sc.nextLong();
		long K =sc.nextLong();
		
		if(A > K) {
			A = A - K;
			System.out.print(A+" "+B);
		}else{
		 if(A+B > K) {
			 B = B - (K - A);
			 System.out.println(0+" "+B);
			 
		 }else {
			 System.out.print(0+" "+0);
		 }
			
		}
		
		
		
		
	}
	

}