
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = k / 2;
		int b = k - a;
		int ans = a * b;
		System.out.println(ans);

	}

}
