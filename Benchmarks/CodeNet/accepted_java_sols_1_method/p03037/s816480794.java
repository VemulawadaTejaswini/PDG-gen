import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L[] = new int[M];
		int R[] = new int[M];

//		int OK[] = new int[N] ;
//		for( int i = 0 ; i < N ; i ++ ) {
////			OK[i] = 0 ;
//			OK[i] = 1 ;
//		}

		int lmax = 1 ;
		int rmin = N ;
		for( int i = 0 ; i < M ; i ++ ) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			if(lmax < L[i] ) {
				lmax = L[i] ;
			}
			if(R[i] < rmin  ) {
				rmin = R[i] ;
			}
		}

//		System.out.println("lmax =" + lmax + ",rmin=" + rmin );
//		for( int i = 0 ; i < M ; i ++ ) {
//			System.out.println("L[i] =" + L[i] + ",R[i]=" + R[i] );
//		}
		if(rmin < lmax ) {
			System.out.println(0);
		}else {
			System.out.println(rmin - lmax + 1);
		}

	}

}
