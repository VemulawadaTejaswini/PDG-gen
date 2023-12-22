import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nam = sc.nextInt();
		int har = nam/2;
		String stc = sc.next();
		
		    String ans = "No";
	    	String front = stc.substring(0, har);
	    	String back  = stc.substring(har, nam);
	    	if (front.equals(back)){
		         ans = "Yes";
	    	}
		System.out.println(ans);
	}
}
