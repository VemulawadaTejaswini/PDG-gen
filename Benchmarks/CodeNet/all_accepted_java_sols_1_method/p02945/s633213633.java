import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 
	     int ans = A + B;
	     int b = A - B;
	     if(ans < b) {
	    	 ans = b;
	     }
	     int c = A * B;
	     if(ans < c) {
	    	 ans = c;
	     }
	     
		 System.out.println(ans);
	}
}
