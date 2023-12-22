import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//枚数
		int Y = sc.nextInt();	//金額
		int M = 0;				//諭吉の枚数
		int G = 0;				//一葉の枚数
		int S = 0;				//英世の枚数
		int chek = 0;			//0の時不可能　-1 -1 -1

		loop: for(int i = 0; i <= N; i++) {
			if(i == 0 && N * 10000 == Y) {	// 10000 * 枚数 = 金額なら即終了
				M = N;
				chek = 1;
				break loop ;
			}
			if(i == 0 && N * 5000 == Y) {	// 5000 * 枚数 = 金額なら即終了
				G = N;
				chek = 1;
				break loop ;
			}
			if(i == 0 && N * 1000 == Y) {	// 1000 * 枚数 = 金額なら即終了
				S = N;
				chek = 1;
				break loop ;
			}
			if(Y >= i * 10000 && Y <= N * 10000) {	//諭吉カウンター
				M = i;
			}
			for(int j = 0; j <= N - M; j++) {		//一葉カウンター
				G = j;
				if(M + G == N && M * 10000 + G * 5000 == Y) {	//諭吉 + 一葉 = 枚数　かつ　諭吉 + 一葉 = 金額なら終了
					chek = 1;
					break loop;
				}
				if((Y - (M * 10000 + G * 5000)) / 1000 == N - M - G) {	//金額 - 諭吉 - 一葉 = 英世の倍数　かつ　英世 = 残り枚数なら終了
					S = (Y - (M * 10000 + G * 5000)) / 1000;
					chek = 1;
					break loop;
				}
			}
		}
		if(chek == 0) {
			M = -1;
			G = -1;
			S = -1;
		}
		System.out.print(M + " " + G + " " + S);
	}
}