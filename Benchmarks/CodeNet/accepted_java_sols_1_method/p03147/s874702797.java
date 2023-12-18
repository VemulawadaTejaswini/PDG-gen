import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++) h[i] = sc.nextInt();
		int ans = 0;
		for(int interval = N; interval >= 1; interval--) {
			for(int i = 0; i + interval - 1 < N; i++) {
				int j = i + interval - 1;
				int min = Integer.MAX_VALUE;
				for(int k = i; k<=j; k++) min = Math.min(min, h[k]);
				if(min == 0) continue;
				for(int k = i; k<=j; k++) {
					h[k] -= min;
				}
				ans += min;
			}
		}
		System.out.println(ans);
	}
}
