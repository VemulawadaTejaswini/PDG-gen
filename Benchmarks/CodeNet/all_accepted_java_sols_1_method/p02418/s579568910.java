import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = a + a;
		String c = sc.nextLine();
		if (b.contains(c))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
