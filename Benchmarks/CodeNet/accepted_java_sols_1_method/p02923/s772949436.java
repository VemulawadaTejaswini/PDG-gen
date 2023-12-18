import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1; i++) {
		int count = 0;
		if(n-i<=ans) {
			break;
		}
			for(int j = i+1; j < n; j++) {
				if(h[i] >= h[j]) {
					count++;
					h[i] = h[j];
				}
				else {
					break;
				}
			}
			ans = Math.max(ans,count);
		}
		System.out.println(ans);
	}
}
