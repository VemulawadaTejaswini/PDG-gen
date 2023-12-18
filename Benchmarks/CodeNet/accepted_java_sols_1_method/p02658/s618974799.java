import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];  //Aという配列を作成。N＋1個の配列がある。

//	いずれかのAに0が含まれる場合
		for(int i=0 ; i<N ; i++) {
			A[i]=sc.nextLong();  //入力された配列の読み込み
			if(A[i] == 0) {
				System.out.println(0);
				return;
			}
		}

//	Aへの入力の時点で結果が「-1」になる場合
		long total = 1;  //計算結果を表す変数
		for(int i=0 ; i<N ; i++) {
			if(A[i] > 1000000000000000000L / total) {
				System.out.println(-1);
				return;
			}
			else {
				total *= A[i];
			}
		}

//	計算してみないと「-1」になるかわからない場合
		if(total <= 1000000000000000000L) {
			System.out.print(total);
		}
		else {
			System.out.print(-1);
		}
	}
}