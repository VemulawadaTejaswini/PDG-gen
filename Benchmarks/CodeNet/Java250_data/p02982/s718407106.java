import java.util.*;

public class Main {

	public static boolean dis(int x[], int y[], int d){
		long ans = 0;
		for(int i = 0; i < d; ++i){
			int tmpx = x[i];
			int tmpy = y[i];
			ans += (tmpx - tmpy) * (tmpx - tmpy);
		}
		double ansd = Math.sqrt((double)ans);
		return (ansd == Math.floor(ansd));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int x[][] = new int[n][d];
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < d; ++j)
				x[i][j] = sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i = 0; i < n;++i){
			for(int j = i + 1; j < n; ++j){
				if(dis(x[i], x[j], d))++ans;
			}
		}

		System.out.println(ans);
	}
}
