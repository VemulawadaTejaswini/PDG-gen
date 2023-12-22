import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 入居者管理用配列
		int dorm[][][] = new int[4][3][10];
		// 全ての部屋人数に0を設定
		for(int b=0; b<4; b++) {
			for(int f=0; f<3; f++) {
				for(int r=0; r<10; r++) {
					dorm[b][f][r] = 0;
				}
			}
		}

		// 情報入力
		for(int i=0; i<n; i++){
			int building = sc.nextInt();
			int floor = sc.nextInt();
			int room = sc.nextInt();
			int count = sc.nextInt();

			// 指定部屋の人数を増減
			dorm[building-1][floor-1][room-1] += count;
		}

		sc.close();

		// 出力
		for(int b=0; b<4; b++) {
			for(int f=0; f<3; f++) {
				for(int r=0; r<10; r++) {
					System.out.print(" " + dorm[b][f][r]);
				}
				System.out.println("");
			}
			if(b!=3) System.out.println("####################");
		}

	}

}
