import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");

		int[] P = new int[N];

		for(int i=0;i<N;i++){
			P[i] = Integer.parseInt(Ws[i]);
		}

		int ans =0;
		int Pj =Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			if(P[i]<=Pj){
				ans++;
				Pj=P[i];
			}
		}

		System.out.println(ans);



	}


}
