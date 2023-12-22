import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] S = sc.next().toCharArray();
    	String ans = "AC";
    	boolean check = true;
    	for (int i = 0; i < S.length; i++) {
    		if (i == 0) {
    			if (S[0] != 'A') ans = "WA";
    		} else if (1 < i && i < S.length-1 && check) {
    			if (S[i] == 'C') check = false;
    		} else {
    			if (S[i] < 97) ans = "WA";
    		}
    	}
    	System.out.println(check ? "WA" : ans);
    }
}