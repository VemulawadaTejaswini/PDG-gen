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
		int[] B = new int[Ws.length];
		for(int i=0;i<Ws.length;i++){
			B[i]=Integer.parseInt(Ws[i]);
		}

		int[] A = new int[N];
		A[0]=B[0];
		for(int i=1;i<N-1;i++){
			A[i] = Math.min(B[i-1], B[i]);
		}

		A[N-1]=B[N-2];

		long ans =0;
		for(int i=0;i<N;i++){
			ans+=A[i];
//			System.out.print(A[i]+" ");
		}

		System.out.println(ans);
	}
}
