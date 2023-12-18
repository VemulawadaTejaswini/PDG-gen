import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean h = true;
        boolean ok = true;
        for(int i = 0; i < S.length(); i++) {
        	if(h) {
        		if(S.charAt(i) != 'h')
        			ok = false;
        		h = false;
        	}
        	else {
        		if(S.charAt(i) != 'i')
        			ok = false;
        		h = true;
        	}
        }
        if(S.length() % 2 != 0)
        	ok = false;
        System.out.println(ok ? "Yes" : "No");
    }
}