import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long N = Long.parseLong(W);

		long ans = N-1;
		double sq = Math.sqrt(N);
		long i = (long)sq;

		for(;i>0;i--){
			if(N%i==0){
				ans = Math.min(ans, i+N/i-2);
			}
		}
		System.out.println(ans);
	}
}
