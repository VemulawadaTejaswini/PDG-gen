import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bit = new int [M];
		for(int i = 0; i < M; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int s = sc.nextInt();
				// 電球に対して繋がっているスイッチのフラグを立てる
				// 1を左にs-1ビット = スイッチの位置をbitの位置に置き換える
				// ORを取ることで接続されているスイッチの位置のみフラグを立てることができる
				bit[i] |= 1 << (s - 1);
			}
		}
		int[] p = new int[M];
		for(int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

		//--test
		// System.out.println("----------");
		// for(int i = 0; i < M; i++) {
		// 	System.out.print(p[i] + ":" + Integer.toBinaryString(bit[i]));
		// 	System.out.println("");
		// }
		// System.out.println("----------");
		//--test

		int ans = 0;
		// スイッチの数の^2までのループ
		// ^2の理由：スイッチの数分bitに置き換えているから
		// 例)スイッチの数が5であれば2^5=16まで
		for(int i = 0; i < Math.pow(2, N); i++) {
			boolean ok = true;
			// 電球の数分のループ
			// スイッチiをONにしたときに電球すべての条件に該当するか判定する
			// (電球が点灯するp[j]と一致する場合、OK)
			for(int j = 0; j < M; j++) {
				// スイッチのONの数を取得
				int bitCnt = Integer.bitCount(bit[j] & i);
				// スイッチのONの数を2で割った余りが電球の点灯条件に一致しない場合
				// NGのパターンとなる
				if(bitCnt % 2 != p[j]) {
					// System.out.println("[NG]swith on > "+(i)+":"+
					// Integer.toBinaryString(bit[j])+"&"+(i)+"="+
					// Integer.toBinaryString(bit[j]&i)+" "+
					// "bitCnt="+Integer.bitCount(bit[j])+
					// " >> "+bitCnt+
					// " p[j]="+p[j]
					// );
					ok = false;
					break;
				}
				// System.out.println("[OK]swith on > "+(i)+":"+
				// Integer.toBinaryString(bit[j])+"&"+(i)+"="+
				// Integer.toBinaryString(bit[j]&i)+" "+
				// "bitCnt="+Integer.bitCount(bit[j])+
				// " >> "+bitCnt+
				// " p[j]="+p[j]
				// );
			}
			if(ok) { 
				ans++;
				// System.out.println(" >> anser count");
			}
		}
		System.out.println(ans);
	}
}
