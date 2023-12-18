import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int h = sc1.nextInt();
		int w = sc1.nextInt();
		int count = 0;
		int countA = 0;
		int tmpA = 0;
		int tmpB = 0;
		int tmpC = 0;
		int tmpD = 0;
		int[][] map = new int[h][w];
		String array[] = new String[h*w];

		for ( int i = 0 ; i < h ; i++ ) {
			for ( int j = 0 ; j < w ; j++) {
				map[i][j] = sc1.nextInt();
			}
		}

		for ( int i = 0 ; i < h ; i++ ) {
			for ( int j = 0 ; j < w ; j++) {
				if (map[i][j] % 2 != 0) {
					//下チェック
					if (j < w-1) {
						if (map[i][j+1] % 2 != 0) {
							map[i][j]--;
							map[i][j+1]++;
							count++;
							tmpA = i+1;
							tmpB = j+1;
							tmpC = i+1;
							tmpD = j+2;
							array[countA] = tmpA + " " + tmpB + " " + tmpC + " " + tmpD;
							countA++;
							continue;
						}
					}

					//右チェック
					if (i < h-1) {
						map[i][j]--;
						map[i+1][j]++;
						count++;
						tmpA = i+1;
						tmpB = j+1;
						tmpC = i+2;
						tmpD = j+1;
						array[countA] = tmpA + " " + tmpB + " " + tmpC + " " + tmpD;
						countA++;
					}
					else if (j < w-1) {
						map[i][j]--;
						map[i][j+1]++;
						count++;
						tmpA = i+1;
						tmpB = j+1;
						tmpC = i+1;
						tmpD = j+2;
						array[countA] = tmpA + " " + tmpB + " " + tmpC + " " + tmpD;
						countA++;
					}
				}
			}
		}

		System.out.println(count);

		for ( int i = 0 ; i < countA ; i++ ) {
			System.out.println(array[i]);
		}

		//System.out.println();

		//for ( int i = 0 ; i < h ; i++ ) {
		//	for ( int j = 0 ; j < w ; j++) {
		//		System.out.println(map[i][j]);
		//	}
		//}

		sc1.close();

	}

}