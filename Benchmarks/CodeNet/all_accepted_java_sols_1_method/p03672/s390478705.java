
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String s = scan.next();
	
	int length = s.length();
	while(length > 0) {
	    length -= 2;
	    String s1 = s.substring(0, length/2);
	    String s2 = s.substring(length/2, length);
	    if(s1.equals(s2)) break;
	}

	System.out.println(length);
	scan.close();
    }
}
