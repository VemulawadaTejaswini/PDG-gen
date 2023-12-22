import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(s.lastIndexOf('Z') - s.indexOf('A') + 1);

		sc.close();
	}

}
