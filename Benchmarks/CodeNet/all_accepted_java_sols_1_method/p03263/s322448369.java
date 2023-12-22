import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int[][]a = new int[H][W];
		int cnt = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int t = scan.nextInt();
				a[i][j] = t;
				if(t % 2 == 1) {
					cnt++;
				}
			}
		}
		scan.close();
		StringBuilder sb = new StringBuilder();
		int[][] list = new int[H * W][2];
		int[] list2 = new int[cnt];
		int index = 0;
		int cnt2 = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int k = 0;
				if(i % 2 == 1) {
					k = W - j - 1;
				}else {
					k = j;
				}
				if(a[i][k] % 2 == 1) {
					list2[cnt2] = index;
					cnt2 ++;
				}
				list[index][0] = i;
				list[index][1] = k;
				index++;
			}
		}
		int l = cnt;
		if(cnt % 2 == 1) {
			l --;
		}
		int n = 0;
		for(int i = 0; i < l; i+=2) {
			for(int j = list2[i]; j < list2[i+1]; j++) {
				int a1 = list[j][0] + 1;
				int a2 = list[j][1] + 1;
				int a3 = list[j+1][0] + 1;
				int a4 = list[j+1][1] + 1;
				sb.append(a1 + " " + a2 + " " + a3 + " " + a4);
				sb.append("\n");
				n++;
			}
		}
		System.out.println(n);
		System.out.println(sb.toString());

	}

}