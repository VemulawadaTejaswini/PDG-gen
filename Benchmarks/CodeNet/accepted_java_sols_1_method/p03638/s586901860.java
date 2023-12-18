import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		int c[][] = new int[h][w];
		int now = 0;
		for (int i = 0; i < h; i++) {
			for (int o = 0; o < w; o++) {
				c[i][o] = now + 1;
				a[now]--;
				if (a[now] == 0) {
					now++;
				}

			}
		}
		for (int i = 0; i < h; i++) {
			if (i % 2 == 0) {


				for (int o = 0; o < w; o++) {
					System.out.print(c[i][o]);

				if(o!=w-1){
					System.out.print(" ");
				}}
			} else {

				for (int o = w - 1; o >= 0; o--) {
					System.out.print(c[i][o]);
					if(o!=0){
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}