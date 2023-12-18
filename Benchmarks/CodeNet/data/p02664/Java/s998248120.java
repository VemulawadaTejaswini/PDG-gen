import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		sc.close();

		System.out.println(t.replaceAll("\\?", "D"));
	}
}
