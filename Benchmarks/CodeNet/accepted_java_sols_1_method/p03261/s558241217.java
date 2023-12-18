import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	char save = 0;
    	String ans = "Yes";
    	Set<String> old = new HashSet<>();
    	for (int i = 0; i < N; i++) {
    		String s = sc.next();
    		if (i != 0 && (s.charAt(0) != save || old.contains(s))) {
    			ans = "No";
    			break;
    		}
    		save = s.charAt(s.length()-1);
    		old.add(s);
    	}
    	System.out.println(ans);
    }
}