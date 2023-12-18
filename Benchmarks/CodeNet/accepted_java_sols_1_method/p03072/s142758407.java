import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		
		int ans = 1;
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int max = h[0];
		for(int i = 1; i < n; i++) {
			if(h[i] >= max && h[i] >= h[i-1]) {
				ans ++;
				max = h[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}
	
}

