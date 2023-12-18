import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				String A = br.readLine();
				String B = br.readLine();
				if ((A.length() > 80)|| (B.length() > 80)) {
					System.out.println("overflow");
				} else {
					BigInteger P = new BigInteger(A);
					BigInteger Q = new BigInteger(B);
					BigInteger R = new BigInteger("0");

					R = R.add(P); R = R.add(Q);
					String total = R.toString();

					if (total.length() > 80) {
						System.out.println("overflow");
					} else {
						System.out.println(total);
					}

				}

			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}