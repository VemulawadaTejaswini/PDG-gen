import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] D = W.split(" ");
		int[] d = new int[N];
		for(int i=0;i<N;i++){
			d[i] = Integer.parseInt(D[i]);
		}
		long ans =0;
		for(int i=0;i<N;i++){
			for(int k=i+1;k<N;k++){
				ans += d[i]*d[k];
			}
		}

		System.out.println(ans);

	}
}
