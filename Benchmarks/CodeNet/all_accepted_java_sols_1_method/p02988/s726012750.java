import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int l = sc.nextInt();
		int m = sc.nextInt();
		int r = 0;
		int ans = 0;

		for(int i=0;i<n-2;i++){
			r = sc.nextInt();
			if(l<=m&&m<=r||l>=m&&m>=r)ans++;
			l=m;
			m=r;
		}

		// 出力
		System.out.println(ans);
	}
}