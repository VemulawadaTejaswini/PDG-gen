import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		int tmp = 7;
		int ans = 1;
		for(int i=1;i<=k;i++) {
			if(tmp%k==0) {
				System.out.println(ans);
				return;
			}
			ans++;
			tmp = (tmp*10+7)%k;

		}
		System.out.println(-1);
	}
}