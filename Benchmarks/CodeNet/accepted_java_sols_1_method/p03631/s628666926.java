import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		System.out.println(new StringBuffer(n).reverse().toString().equals(n) ? "Yes" : "No");

		sc.close();

	}

}