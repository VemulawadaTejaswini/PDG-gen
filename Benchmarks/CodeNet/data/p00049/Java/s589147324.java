
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = 0, b = 0, o = 0, ab = 0;
	while (in.hasNextLine()) {
	 String str = in.next();
	 if (str.contains("AB")) {
		ab++;
	 } else if (str.contains("A")) {
		a++;
	 } else if (str.contains("B")) {
		b++;
	 } else {
		o++;
	 }
	}
	System.out.println(a);
	System.out.println(b);
	System.out.println(ab);
	System.out.println(o);
 }
}