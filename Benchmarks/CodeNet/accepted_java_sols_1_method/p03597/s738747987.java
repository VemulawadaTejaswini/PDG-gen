import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a;
		n = sc.nextInt();
		a = sc.nextInt();
		sc.close();
		int ans = n * n - a;
		System.out.println(ans);
	}

}
