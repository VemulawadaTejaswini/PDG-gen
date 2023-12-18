import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int K = Integer.parseInt(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");
		int[] p = new int[Ws.length];
		for(int i=0;i<Ws.length;i++){
			p[i] = Integer.parseInt(Ws[i]);
		}

		long[] sum = new long[N-K+1];
		Arrays.fill(sum, 0);
		for(int i=0;i<K;i++){
			sum[0]+=p[i];
		}
		int maxIdx=0;
		for(int i=1;i<N-K+1;i++){
			sum[i]=sum[i-1]-p[i-1]+p[i+K-1];
			if(sum[i] > sum[maxIdx]){
				maxIdx=i;
			}
		}

		double ans = 0;
		for(int i=maxIdx;i<maxIdx+K;i++){
			ans+=(p[i]*(p[i]+1)/2.0)/p[i];
//			ans+=(p[i]-1)/2.0;
		}
		System.out.println(ans);


	}


}
