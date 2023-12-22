import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s, t;
		int a, b;
		String u;
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		t = scan.next();
		a = scan.nextInt();
		b = scan.nextInt();
		u = scan.next();

		if(s.equals(u)) {
			System.out.println((a-1) + " " + b);
		} else if(t.equals(u)){
			System.out.println(a + " " + (b-1));
		}
		scan.close();
	}

}
