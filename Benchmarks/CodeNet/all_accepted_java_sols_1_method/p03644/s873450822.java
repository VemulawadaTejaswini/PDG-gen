import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int max = 0;
		for(int i = 1 ; i <= n ; i++) {
			int mod = i;
			int cnt = 0;
			while(mod % 2  == 0) {
				mod = mod / 2;
				cnt++;
			}
			if(cnt >= max) {
				max = cnt;
				ans = i;
			}
		}
		System.out.println(ans);
		sc.close();

	}

}
