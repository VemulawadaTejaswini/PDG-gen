import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String ans = "Yes";
		
		if (S.length()+1!=T.length()) {
			ans = "No";	
		}
		
		if (S !=T.substring(0, T.length()-1)) {
			ans = "No";
		}

		System.out.println(ans);
		

    }
}