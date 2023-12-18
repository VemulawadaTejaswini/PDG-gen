import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input_str[] = new String[3];
			input_str = br.readLine().split("\\s+");
			int N = Integer.parseInt(input_str[0]);
			int M = Integer.parseInt(input_str[1]);
			int R = Integer.parseInt(input_str[2]);

			if(N*M > R){
				System.out.println(0);
				return;
			}

			int num = R-M*N+N-1;

			int[] bunbo = new int[N];
			for(int i = 0; i < N-1; i++){
				bunbo[i] = num-i;
			}

			int tmp,common;

			for(int i = N-1; i >= 2; i--){
				tmp = i;
				for(int k = 0; k < N-1; k++){

					if(bunbo[k] == 1)continue;

					common = gcd(tmp,bunbo[k]);
					if(common == 1)continue;

					tmp /= common;
					bunbo[k] /= common;

					if(tmp == 1)break;
				}
			}

			BigInteger ANS = new BigInteger("1");
			for(int i = 0; i < N-1; i++){
				ANS = ANS.multiply(new BigInteger(Integer.toString(bunbo[i])));
			}

			System.out.println(ANS.toString());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int gcd(int A,int B){
		if(A < B){
			int tmp = B;
			B = A;
			A = tmp;
		}
		if(B == 0){
			return A;
		}else{
			return gcd(B,A%B);
		}
	}

}


