import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int ans=(n>k)? k*x+(n-k)*y:n*x;
		System.out.println(ans);
	}
}