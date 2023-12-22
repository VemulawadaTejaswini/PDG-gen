import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO ABC_088_B
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		List<Integer> A = new ArrayList<Integer>();
		int i=0, j=0, tmp = 0;
		int ret = 0;

		for(i = 0;i < N; i++) {

			tmp = sc.nextInt();

			for(j=0; j<=i; j++) {
				if(j == i) {
					A.add(tmp);
				} else {
					if(A.get(j) <= tmp) {
						A.add(j, tmp);
						break;
					}
				}
			}
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		for(i = 0;i < N; i++) {
			if(i%2 == 0) {
				ret += A.get(i);
			} else {
				ret -= A.get(i);
			}
		}

		// 出力
		System.out.println(ret);

	}
}
