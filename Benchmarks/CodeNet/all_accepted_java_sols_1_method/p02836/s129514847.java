import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int count = 0;
	int t = s.length() / 2;
	for (int i=0; i<t; i++) {
	    if (s.charAt(i) != s.charAt(s.length()-1-i)) {
		count++;
	    }
	}
	System.out.print(count);
    }
}
