import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int D = Integer.parseInt(Ws[1]);

		double x = N/((2.0*D)+1);
		long ans = (long)x;
		if(x-ans > 0){
			ans++;
		}

		System.out.println(ans);

	}


}
