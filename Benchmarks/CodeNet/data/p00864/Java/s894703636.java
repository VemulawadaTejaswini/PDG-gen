import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt(), w = sc.nextInt();
			if(n == 0 && w == 0) break;

			int max_v = Integer.MIN_VALUE;
			int v[] = new int[n];
			for(int i=0;i<n;i++){
				v[i] = sc.nextInt();
				max_v = Math.max(v[i], max_v);
			}

			int max_bar = Integer.MIN_VALUE;
			int bar[] = new int[max_v/w+1];
			for(int i=0;i<n;i++){
				bar[v[i]/w]++;
				max_bar = Math.max(max_bar, bar[v[i]/w]);
			}

			double ans = 0.0;
			for(int i=0;i<bar.length;i++){
				ans += (double) (bar.length - i - 1) / (bar.length - 1) * bar[i] / max_bar;
			}
			System.out.println(ans+0.01);
		}

	}
}