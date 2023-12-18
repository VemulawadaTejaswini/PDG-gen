import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			int ans = 0;
			for(int i=0;i<n;i++) {
				int xi = sc.nextInt();
				int yi = sc.nextInt();
				if (x <= xi && xi <= x + w) {
					if (y <= yi && yi <= y + h) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}

}