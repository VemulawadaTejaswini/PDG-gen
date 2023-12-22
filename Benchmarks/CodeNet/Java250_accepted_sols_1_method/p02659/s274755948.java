import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b  = sc.next();
		b = b.replace(".","");
		int bb = Integer.parseInt(b);
		System.out.println(a*bb/100);
	}
}