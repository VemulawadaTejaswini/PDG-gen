import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W) +1;
		long[] A = new long[N];
		long[] B = new long[N];


		W = in.readLine();
		String[] Ws = W.split(" ");
		for(int i=0;i<N;i++){
			A[i] = Long.parseLong(Ws[i]);
		}

		W = in.readLine();
		Ws = W.split(" ");
		for(int i=0;i<N-1;i++){
			B[i] = Long.parseLong(Ws[i]);
		}
		B[N-1]=0;

		long destory=0;
		long diff=0;
		for(int i=0;i<N;i++){
			//A[i-1]の勇者が何体倒せるか
			if(diff >= A[i]){
				//全部倒せるなら戦力を次に残す
				diff=B[i];
				destory+=A[i];
			}else{
				//倒せない場合は残りをA[i]で倒す
				long remain = A[i] -diff;
				destory+=diff;
				//A[i]の戦力ですべて倒せるか
				if(remain <= B[i]){
					//倒せる場合は次に残す戦力を計算する
					diff=B[i]-remain;
					destory+=remain;
				}else{
					//倒せない場合は倒せる数だけ倒す
					diff=0;
					destory+=B[i];

				}
			}
		}
		System.out.println(destory);


	}

}
