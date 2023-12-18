import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		String a1;
		String a2;

		a1=sc.next();

		a2=sc.next();
		String ans ="";
		for(int i=0;i<A;i++) {
			char aa =a1.charAt(i);
		    char bb =a2.charAt(i);
	        ans += String.valueOf(aa) + String.valueOf(bb);
			
		}
		
		System.out.println(ans);
	    
	    
	     
	}
	
}

