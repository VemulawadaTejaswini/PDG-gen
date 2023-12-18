import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, h, w; 
		n = scanner.nextInt();
		h = scanner.nextInt();
		w = scanner.nextInt();
		int cnt = 0;
		for (int i=0; i<n; i++) {
			int x, y;
			x = scanner.nextInt();
			y = scanner.nextInt();
			if (x >= h && y >= w) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}