import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");
		int[] A = new int[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = (int)Long.parseLong(Ws[i]);
		}

		long ans = 0;
		for(int i=0;i<N;i++){
			if(i==A[A[i]-1]-1){
				ans++;
			}
		}

		System.out.println(ans/2);


	}
}
