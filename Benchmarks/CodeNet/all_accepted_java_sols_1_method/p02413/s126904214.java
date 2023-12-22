import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//行数
		int a = sc.nextInt();
		//列
		int b = sc.nextInt();
		int[][] list = new int[a + 1][b + 1];
		
		//配列に格納する
		for (int i = 0; i < a; i++) {
		    for (int j = 0; j < b; j++) {
		        list[i][j] =sc.nextInt();
		    }
		}
		
		for (int i = 0; i < a; i++) {
			int sum = 0;
			for (int j = 0; j < b; j++) {
				sum += list[i][j];
			}
			list[i][b] = sum;
		}
		
		//右下の合計値を含めた列
		for (int i = 0; i < b + 1; i++) {
			int sum = 0;
			for (int j = 0; j < a; j++) {
				sum += list[j][i];
			}
			list[a][i] = sum;

		}

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
			    //半角スペースを先頭だけ除外する
				if (j == 0)
					System.out.print(list[i][j]);
				else
					System.out.print(" " + list[i][j]);

			}
			System.out.println();
		}
    }
}
