import java.util.*;

public class Main {
    public static void main (String [] args) {
	String str = new Scanner(System.in).nextLine();

	for (int i = 0 ; i < str.length() ; i++) {
	    char c = str.charAt(i);

	    if ('a' <= c && c <= 'z') {
		System.out.print((char)(c - ('a'-'A')));
	    } else if('A' <= c && c <= 'Z') {
		System.out.print((char)(c + ('a'-'A')));
	    } else {
		System.out.print(c);
	    }
	}
	System.out.println("");
    }
}