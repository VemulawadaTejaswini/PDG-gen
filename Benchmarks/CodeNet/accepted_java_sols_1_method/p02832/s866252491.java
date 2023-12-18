
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(num == a) {
				num++;
			} else {
				ans++;
			}
		}
		if(num == 1) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}

}
