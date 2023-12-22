import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int L = Integer.parseInt(W);

		double a = (double)L/(double)3;
		double ans = a * a * a;

		System.out.printf("%.12f",ans);
	}


}
