import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		
		int[] h = new int[n];
		for (int i = 0; i < n; i++)
			h[i] = Integer.parseInt(sc.next());

		double abs;
		int ans = 0;
		double min = 100000.0;
		for (int i = 0; i < n; i++) {
			abs = Math.abs(a - (t - h[i] * 0.006));
			if (abs < min) {
				min = abs;
				ans = i + 1;
			}
		}
      
		System.out.println(ans);
		
		sc.close();
	}
}