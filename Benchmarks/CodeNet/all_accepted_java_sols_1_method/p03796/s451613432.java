
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		long ans=1;
		for(int i=2;i<=n;i++) {
			ans*=i;
			ans%=1000000007;
		}
		System.out.println(ans);

	}
}