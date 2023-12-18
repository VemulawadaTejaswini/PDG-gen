import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input[] = br.readLine().split("\\s+");

			String str_A = input[0],str_B = input[1];

			BigInteger A = new BigInteger(input[0]);

			if(str_B.charAt(0) == '-'){

				str_B = str_B.substring(1);

			}else{

				str_B = "-" + str_B;
			}
			BigInteger B = new BigInteger(str_B);

			BigInteger ans;

			ans = A.add(B);
			System.out.println(ans);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}


