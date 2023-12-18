import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		boolean[] isP = new boolean[102];
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			isP[p] = true;
		}
		
		int ans = -1;
		int minAbs = Math.abs(x + 1);
		for (int i = 0; i <= 101; i++) {
			if (isP[i]) continue;
			
			int abs = Math.abs(x - i);
			if (abs < minAbs) {
				minAbs = abs;
				ans = i;
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}


