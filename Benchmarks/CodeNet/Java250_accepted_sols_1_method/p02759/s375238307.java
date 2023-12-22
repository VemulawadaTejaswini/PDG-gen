import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = n/2;
		if(n % 2 == 1) {
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}