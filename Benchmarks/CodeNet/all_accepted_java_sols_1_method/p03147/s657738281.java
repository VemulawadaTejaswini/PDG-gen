import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			max = Math.max(max,h[i]);
		}
		int count = 0;
		int ans = 0;
		for (int i = 1; i <= max; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if(h[j]>0) {
					if(j==0) count++;
					else if(h[j-1] == 0) count++;
				}
			}
			for (int j = 0; j < n; j++) {
				if(h[j]>0) h[j]-=1;
			}
			ans += count;
		}
		System.out.println(ans);
		sc.close();
	}
}