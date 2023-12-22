
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Nは参加者数、Kは初期ポイント、Qはクイズの数
		 * A(i)は正解した人の名前
		 * 出力は1行ごとにその人の合否判定
		 *正解の人はポイント増えなくてその他だけ減るが、
		 *全員全問不正解、正答者のみ+1と考える
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] mens = new int[n];

		for(int i = 0; i < n; i++) {
			mens[i] = k - q;
		}
		
		
		for(int i = 0; i < q; i++) {
			int j = sc.nextInt() - 1;
			mens[j]++;
			
		}
		for(int man: mens) {
			if(man > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
