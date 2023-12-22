import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i=0;i<=n;i++) {
			int nn=i;
			int sum = 0;
			while (nn>0) {
				sum += nn%10;
				nn /= 10;
			}
			if(sum>=a && sum<=b) {
				ans += i;
			}
		}
		System.out.println(ans);
	}

}