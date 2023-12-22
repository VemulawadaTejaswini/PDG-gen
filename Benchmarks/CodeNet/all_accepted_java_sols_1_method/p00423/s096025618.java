import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while (true){
			int length = sc.nextInt();
			// 0 なら終了
			if (length == 0){
				break;
			}

			int[] a = new int[length];
			int[] b = new int[length];
			int score_a = 0;
			int score_b = 0;

			for (int i = 0; i < length; i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();

				if (a[i] > b[i]){
					score_a += a[i] + b[i];
				}else if (a[i] < b[i]){
					score_b += a[i] + b[i];
				}else{
					score_a += a[i];
					score_b += b[i];
				}
			}

			// 出力
			System.out.println(score_a + " " + score_b);
		}
	}
}