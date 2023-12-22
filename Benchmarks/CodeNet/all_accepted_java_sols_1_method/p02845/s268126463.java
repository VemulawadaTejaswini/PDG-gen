import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ
		int N = scn.nextInt();
		int MOD = 1000000007;
		long ans = 1;
		int[] num = new int[3];
		for(int i = 0;i < N;i++) {
			int A = scn.nextInt();
			int c = 0;
			for(int j = 0;j < 3;j++) {
				if(num[j]==A)c++;
			}
			ans *= c;
			ans %= MOD;
			for(int j = 0;j < 3;j++) {
				if(num[j]==A) {
					num[j]++;
					break;
				}
			}
			Arrays.sort(num);
		}
		System.out.println(ans);
	}

}
