

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			long a = Integer.parseInt(arr[0]);
			long b = Integer.parseInt(arr[1]);
			
			long n_gcd = gcd(a, b);
			long n_lcm = a * b / n_gcd;
			
			System.out.println(n_gcd + " " + n_lcm);
		}
	}
	
	public static long gcd(long x, long y) {
		if (x < y) {
			long temp = x;
			x = y;
			y = temp;
		}
		
		while (y > 0) {
			long r = x % y;
			x = y;
			y = r;
		}
		
		return x;
	}

}