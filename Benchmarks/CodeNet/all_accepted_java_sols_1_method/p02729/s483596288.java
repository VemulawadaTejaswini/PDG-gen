import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();

		System.out.println(n*(n-1)/2+m*(m-1)/2);

		stdIn.close();
	}
}
