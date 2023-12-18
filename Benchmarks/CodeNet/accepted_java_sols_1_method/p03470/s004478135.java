import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[]d = new int[n];
		int ans = 0;
		for(int i=0;i<n;i++) {
			int nyu = sc.nextInt();
			int status = 0;
			for(int j=0;j<n;j++) {
				if(d[j]==nyu) {
					status = 1;
				}
			}
			if(status == 0) {
				ans ++;
			}
			d[i] = nyu;
		}
		// 文字列の入力
		//String s = sc.next();
		// 出力
		//for(int i=0;i<n;i++) {
		//	System.out.println(d[i]);
		//}
		System.out.println(ans);
	}
}
