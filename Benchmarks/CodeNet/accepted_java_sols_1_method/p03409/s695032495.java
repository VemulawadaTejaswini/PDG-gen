import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int red[][] = new int[N][2];
		int blue[][] = new int[N][2];
		boolean paired[] = new boolean[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
		}
		//青をx座標で昇順
		Arrays.sort(blue, (a,b) -> a[0]-b[0]);
		//赤をy座標で昇順
		Arrays.sort(red, (a,b) -> a[1]-b[1]);
		for (int i = 0; i < N; i++) {
			for (int j = N-1; j >= 0; j--) {
				//x座標が青>赤、y座標が青>赤、ペアになっていない点
				if (blue[i][0]>red[j][0] && blue[i][1]>red[j][1] && !paired[j]) {
					ans ++;
					paired[j] = true;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
