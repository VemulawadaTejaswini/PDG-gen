import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int s = scanner.nextInt();
		int ans = 0;
		
		int[] n = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			n[i] = i;
		}
		
		
		// x, y , z <= k, x+y+z=s <=> x+y = s-z;
		for (int i = 0; i < n.length; i++) {
			int x = i;
			for (int j = 0; j < n.length; j++) {
				int y = j;
				int z = s - x - y;
				if (z>=0 && z<=k) {
					ans ++;
				}
			}
		}
		System.out.println(ans);
		
		scanner.close();
	}

}