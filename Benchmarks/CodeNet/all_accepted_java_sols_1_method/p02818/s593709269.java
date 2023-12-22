import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		long al = Long.parseLong(a);
		long bl = Long.parseLong(b);
		long cl = Long.parseLong(c);

		if (cl <= al) {
			al = al - cl;
		} else {
			cl = cl - al;
			al = 0;
			bl = bl - cl;
		}
		if (bl < 0) {
			bl = 0;
		}
		
		System.out.println(al + " " + bl);
	}

}