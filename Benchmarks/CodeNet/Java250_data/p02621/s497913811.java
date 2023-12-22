import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

 		long ans = n + n * n + n* n* n;

 		System.out.println(ans);
	}
}
