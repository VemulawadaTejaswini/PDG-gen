import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[n];
		for(int i=0;i<n;i++) {
			count[i] = 0;
		}
		for(int i=1;i<=n;i++) {
			int nn = i;
			int j = 2;
			while(nn!=1) {
				if(nn%j==0) {
					count[j-1] += 1;
					nn = nn/j;
					j = 2;
				}else {
					j += 1;
				}
			}
		}
	//	System.out.println(Arrays.toString(count));
		long ans = 1;
		for(int i=1;i<n;i++) {
			if(count[i]!=0) {
				ans = (ans*(count[i]+1))%1000000007;
	//			System.out.println(ans);
			}
		}
		System.out.println(ans);
	}

}