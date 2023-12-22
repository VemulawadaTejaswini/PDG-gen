import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String t = "123";
		String s = sc.next();
		String s2 = sc.next();
		//int n = sc.nextInt();

		sc.close();
		System.out.println(t.replace(s, "").replace(s2, ""));

	}
}

