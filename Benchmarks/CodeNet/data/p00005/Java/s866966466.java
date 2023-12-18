import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		long num[] = new long[2];
		while((str = in.readLine()) != null){
			num[0] = Long.parseLong(str.substring(0, str.indexOf(" ")));
			num[1] = Long.parseLong(str.substring(str.indexOf(" ")+1, str.length()));
			System.out.println(gcd(num[0], num[1]) + " " + lcm(num[0], num[1]));

		}

	}
	static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a%b);
	}
	static long lcm(long a, long b){
		return b*a/gcd(a,b);
	}

}