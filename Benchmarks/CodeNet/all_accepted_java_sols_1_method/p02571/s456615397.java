import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	int min = Integer.MAX_VALUE;
	int count = 0;
	for (int i=0; i<=s.length()-t.length(); i++) {
	    String sis = s.substring(i,i+t.length());
	    count = 0;
	    for (int j=0; j<t.length(); j++) {
		if (sis.charAt(j) != t.charAt(j)) {
		    count++;
		}
	    }
	    if (count < min) {
		min = count;
	    }
	}
	System.out.print(min);
    }
}
