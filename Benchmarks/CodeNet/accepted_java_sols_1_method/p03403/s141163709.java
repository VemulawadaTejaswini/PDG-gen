import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = (int)Long.parseLong(W);

		W = in.readLine();
		String[] Ws = W.split(" ");
		long[] A = new long[Ws.length+2];
		A[0]=0;
		A[A.length-1]=0;
		for (int i = 0; i < Ws.length; i++) {
			A[i+1] = Long.parseLong(Ws[i]);
		}

		long sum = 0;
		for(int i=1;i<A.length;i++){
			sum+=Math.abs(A[i-1]-A[i]);
		}

		long ans = 0;

		for(int i=1;i<A.length-1;i++){
			System.out.println(sum - (Math.abs(A[i-1]-A[i]) + Math.abs(A[i]-A[i+1]))+ Math.abs(A[i-1]-A[i+1]));
		}
	}
}
