import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		sc.close();

		System.out.println(val <= 999 ? "ABC" : "ABD");
	}
}