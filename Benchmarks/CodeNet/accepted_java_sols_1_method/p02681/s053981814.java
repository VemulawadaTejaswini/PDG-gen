import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	int lens = s.length();
	int lent = t.length();
	String t2 = t.substring(lens, lent);

	System.out.println(s.equals(t.substring(0,lens))&&t2.length()==1?"Yes":"No");
    }
}