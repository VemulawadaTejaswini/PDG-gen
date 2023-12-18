import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		
		int ans = 0;
		while(true) {
			int min = 101;
			int mini = -1;
			for(int i = 0; i < n; i++) {
				if(h[i] != 0) {
					min = Math.min(min, h[i]);
					mini = i;
				}
			}
			
			if(min == 101) {
				break;
			}
			int left = mini;
			int right = mini;
			for(int i = mini - 1; i >= 0; i--) {
				if(h[i] == 0) {
					break;
				}
				left--;
			}
			for(int i = mini + 1; i < n; i++) {
				if(h[i] == 0) {
					break;
				}
				right++;
			}
			
			for(int i = left; i <= right; i++) {
				h[i] -= min;
			}
			ans += min;
		}
		
		System.out.println(ans);
	}
}