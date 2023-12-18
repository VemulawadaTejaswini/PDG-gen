import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		long X =  Long.parseLong(Ws[0]);
		long Y =  Long.parseLong(Ws[1]);


		long ans = 0;
		for(long i=X;i<=Y;i+=i){
			ans++;
		}
		System.out.println(ans);
	}
}
