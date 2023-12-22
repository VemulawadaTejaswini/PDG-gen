import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.println(n >= 1000 ? "ABD" : "ABC");
	}
}
