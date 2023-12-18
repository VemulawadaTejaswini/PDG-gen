import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String b = sc.next();
			String str = a + b;
			int num = Integer.parseInt(str);
			int sq = (int) Math.sqrt(num);
			if (sq * sq == num) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}