import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W.split(" ")[0]);
		int M = Integer.parseInt(W.split(" ")[1]);
		int ans = N*(N-1)/2 + M*(M-1)/2;

		System.out.println(ans);
	}


}
