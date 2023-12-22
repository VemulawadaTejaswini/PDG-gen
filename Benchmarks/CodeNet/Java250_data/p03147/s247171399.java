import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int MAX = 0;
		for(int i = 0; i < n; i++) {
			h[i]  = sc.nextInt();
			MAX = Math.max(MAX, h[i]);
		}
		int ans = 0;
		for(int i = 0; i < MAX; i++) {
			int tmp = 1;
			int nzero = 0;
			if(h[0] == 0) {
				while(h[nzero] == 0) {
					nzero ++;
				}
			}
			for(int j = nzero; j < n-1; j++) {
				if(h[j] * h[j+1] == 0 && h[j+1] == 0) {
					if(h[j] + h[j+1] != 0) {
						tmp ++;
					}
					
				}
			}
			if(h[n-1] == 0 && h[nzero] != 0) {
				tmp --;
			}
			for(int j = 0; j < n; j++) {
				if(h[j] != 0) {
					h[j] --;
				}
			}
			
			ans += tmp;
			//System.out.println(ans);
		}
		System.out.println(ans);
		sc.close();
	}
	
}

