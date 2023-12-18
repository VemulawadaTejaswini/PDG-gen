import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int matrix[] = new int[3];
		int n = 0;

		//配列にデータを入力
		while (sc.hasNext()) {
			matrix[n] = sc.nextInt();
            n++;
        }

		//選択ソート
		for(int i = 0; i < n - 1; i++){
		int pos = i;
		for (int j = i + 1; j < n; j++) {
			if (matrix[j] < matrix[pos]) {
				pos = j;
			}
		}
		int w = matrix[i];
		matrix[i] = matrix[pos];
		matrix[pos] = w;
	}

		//出力
		for(int i =0;i < n; i++){
			System.out.println(matrix[i]);
		}
	}
}
