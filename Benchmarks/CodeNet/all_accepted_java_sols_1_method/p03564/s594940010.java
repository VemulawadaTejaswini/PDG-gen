import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		sc.close();
		int ans = 1;
		for(int i = 0; i < n; ++i) {
			int tmp = ans * 2;
			int tmp2 = ans + k;
			ans = Math.min(tmp,  tmp2);
		}
		System.out.println(ans);
	}

}
