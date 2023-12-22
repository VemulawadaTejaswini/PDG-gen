import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		String u = sc.nextLine();
		int ansS = a;
		int ansT = b;
		if (s.equals(u)) {
			ansS = a - 1;
		} else {
			ansT = b - 1;
		}
		System.out.println(ansS + " " + ansT);
		sc.close();
	}
}
