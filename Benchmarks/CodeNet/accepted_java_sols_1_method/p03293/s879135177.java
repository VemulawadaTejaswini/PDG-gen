import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
	    int N = S.length();
	    if (S.equals(T)) {
	    	System.out.println("Yes");
	    	return;
	    }
	    
	    for (int i = 0; i < N; i++) {
	    	char last = S.charAt(N - 1);
	    	S = last + S.substring(0, N - 1);
		    if (S.equals(T)) {
		    	System.out.println("Yes");
		    	return;
		    }
	    }
	    
    	System.out.println("No");
	}
}