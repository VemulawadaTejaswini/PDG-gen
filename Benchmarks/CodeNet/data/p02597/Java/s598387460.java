import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = Integer.parseInt(sc.next());
		//色の入力
		String c = sc.next();
		char[] C = new char[N];
		for (int i = 0; i < N; i++) {
			C[i] = c.charAt(i);
		}
		//赤だったら1、白だったら0で
		int[] nC = new int[N];
		for(int i=0;i<N;i++) {
		if(C[i]=='R') {
			nC[i]=1;
		}else {
			nC[i]=0;
		}
		}
		//左から白を探す→その白より右側に赤がある場合、一番右側にある赤とその白を入れ替える
		int check = 0;
		for (int j = 0; j < N; j++) {
			//白を検索
			int wn = 0;//ホワイトナンバー
			for (int i = 0; i < N; i++) {
				if (nC[i] == 0) {
					wn = i;
					break;
				} else {//ない場合
					wn = N;
				}
			}
			//赤を探す
			int rn = 0;//レッドナンバー
			for (int i = N - 1; i >= 0; i--) {
				if (nC[i] == 1) {
					rn = i;
					break;
				} else {//ない場合
					rn = N;
				}
			}
			//白と赤の場所比較して、場所入れ替え
			if (wn < rn && !(wn == 0 && rn == N)) {
				nC[wn] = 1;
				nC[rn] = 0;
				check++;
			}
		}
		//

		System.out.println(check);
	}

}
