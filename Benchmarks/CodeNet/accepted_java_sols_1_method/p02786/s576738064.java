
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long h = Long.parseLong(br.readLine());
		long pow2[] = new long[100];
		for(int i = 0 ; i < 100 ; i++) {
			pow2[i] =(long) Math.pow(2, i);
		}
		long result = 0;
		for(int i = 0 ; i < 100; i++) {
			if(h >= pow2[i]) {
				result = pow2[i+1] -1;
			}
		}
		System.out.println(result);
	}

}
