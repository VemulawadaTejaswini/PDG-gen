import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int diffCount = 0;
		for (int i = 0; i < args.length; i++) {
			if (s.charAt(i) != t.charAt(i))
				++diffCount;
		}
		System.out.println(diffCount);
		sc.close();
	}
}
