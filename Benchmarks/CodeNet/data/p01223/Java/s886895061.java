import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}
			int max =0;
			int min =0;
			for(int i=0;i<n-1;i++){
				if(h[i]<h[i+1]){
					max = Math.max(max, h[i+1]-h[i]);
				}
				else{
					min = Math.min(min, h[i+1]-h[i]);
				}
			}
			System.out.println(max+" "+-min);
			t--;
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}