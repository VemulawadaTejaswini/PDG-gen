
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int x=sc.nextInt();

		int ans = 0;
		int pos = 0;
		for (int i=0;i<n;i++) {
			if (pos<=x) {
				ans++;
			}
			pos+=sc.nextInt();

		}

		if (pos<=x) {
			ans++;
		}
		System.out.println(ans);
	}
}
