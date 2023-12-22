import java.util.Scanner;

public class Main {
		public static void main(String[] args) {

			//スキャナーを宣言する
		    Scanner sc = new Scanner(System.in);

		    //入力を受け取る
		    int N = Integer.parseInt(sc.next());
		    int K = Integer.parseInt(sc.next());

		    int l[] = new int[N+1];

		    //入力を受け取る
		    for(int cnt = 0; cnt < N; cnt++) {
		    	l[cnt] = Integer.parseInt(sc.next());
		    }
		    //スキャナーを閉じる
		    sc.close();

		    int tmp;
		    int sum = 0;

		    //大きい順にソート
		    //まず0番目と1～N番目の中を比較し、大きかったら入れ替える
		    for(int cnt = 0;cnt < N; cnt++) {
		    	for(int cnt2 = cnt+1;cnt2 < N;cnt2++ ) {
		    		if(l[cnt] < l[cnt2]) {
		    			tmp = l[cnt];
		    			l[cnt] = l[cnt2];
		    			l[cnt2] = tmp;
		    		}
		    	}
		    }
		    //合計を出す
		    for(int cnt =0; cnt < K; cnt++) {
		    	sum = l[cnt] + sum;
		    }

		    System.out.println(sum);
		}
}