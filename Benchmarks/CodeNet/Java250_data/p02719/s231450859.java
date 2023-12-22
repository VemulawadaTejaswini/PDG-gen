import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] command = br.readLine().split(" ");
		long N = Long.parseLong(command[0]);
		long K = Long.parseLong(command[1]);
		
		long a = N / K ;
		long b = N % K;
		
		long result;
		if(b == 0) result = 0;
		
		
		if(a == 0) {
			if(Math.abs(N) > Math.abs(N - K)) {
				result = Math.abs(N - K);
			}else {
				result = Math.abs(N);
			}
		}else{
			result = (Math.min(b, Math.abs(b - K)));
		}
		
		System.out.println(result);
	}

}
