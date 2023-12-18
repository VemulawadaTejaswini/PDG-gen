import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] num = new int[N][10];
		for(int i = 0;i < N;i++) {
			for(int k = 0;k < 10;k++) {
				num[i][k] = scan.nextInt();
			}
		}
//		for(int i = 0;i < N;i++) {
//			for(int k = 0;k < 10;k++) {
//				System.out.print(num[i][k] + " ");
//			}
//			System.out.println();
//		}
		for(int i = 0;i < N;i++) {
			int left = 0;
			int right = 0;
			for(int k = 0;k < 10;k++) {
				if(num[i][k] > left) {
					left = num[i][k];
				}else if(num[i][k] > right) {
					right = num[i][k];
				}else {
					System.out.println("NO");
					break;
				}
				if(k == 9) {
					System.out.println("YES");
				}
			}
		}
		scan.close();
	}
}
