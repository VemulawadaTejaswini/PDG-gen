import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 1;

		for(int i = 0; (ans+1)*(ans+1) <= n; i++){
			ans++;
		}
		System.out.println(ans*ans);
	}
}