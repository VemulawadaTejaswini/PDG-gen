
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] h = new int [n];
		nk = br.readLine().split(" ");
		for(int i = 0 ; i < n ;i++) {
			h[i] = Integer.parseInt(nk[i]);
		}
		Arrays.sort(h);
		long sum  = 0;
		for(int i = 0 ; i< n-k ; i++) {
			sum += h[i];
		}
		System.out.println(sum);
	}

}
