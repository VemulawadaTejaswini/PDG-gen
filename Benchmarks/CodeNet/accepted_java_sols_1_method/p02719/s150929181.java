
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		long n = Long.parseLong(as[0]);
		long k = Long.parseLong(as[1]);
		long result = 0;
		if(n%k == 0) {
			result = 0;
//		}else if(k%n == 0) {
//			result = n;
		}else {
			result = Math.min(n%k, Math.abs(k-n%k))  ;
		}
		System.out.println(result);
	}

}
