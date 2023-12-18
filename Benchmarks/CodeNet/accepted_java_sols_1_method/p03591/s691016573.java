import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	if ( S.length() <= 3 ) {
	    System.out.println("No");
	    return;
	}
	if ( S.charAt(0) == 'Y' &&
	     S.charAt(1) == 'A' &&
	     S.charAt(2) == 'K' &&
	     S.charAt(3) == 'I' ) System.out.println("Yes");
	else System.out.println("No");
    }
}
