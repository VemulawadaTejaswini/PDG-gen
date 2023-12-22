import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				BigInteger a = new BigInteger(br.readLine());
				BigInteger b = new BigInteger(br.readLine());
				String c = a.add(b).toString();
				if(a.toString().length() > 80 || b.toString().length() > 80 || c.length() > 80) {
					System.out.println("overflow");
				} else {
					System.out.println(c);
				}
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}