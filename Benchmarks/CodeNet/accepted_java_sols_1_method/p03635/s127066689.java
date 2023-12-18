import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		int ans = (n - 1) * (m - 1);
		System.out.println(ans);
	}

}
