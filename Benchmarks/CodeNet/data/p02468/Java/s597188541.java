import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		BigInteger d = new BigInteger("1000000007");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a[] = null;
		try {
			a = br.readLine().split(" ");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		BigInteger n = new BigInteger(a[0]);
		n.pow(Integer.parseInt(a[1]));
		System.out.println(n.mod(d).toString());
	}

}