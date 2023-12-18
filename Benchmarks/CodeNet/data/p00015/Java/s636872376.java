import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		BigInteger a,b;
		for (int i = 0; i < N; i++) {
			a = new BigInteger(in.readLine());
			b = new BigInteger(in.readLine());
			if(a.toString().length()>80||b.toString().length()>80){
				System.out.println("overflow");
				break;
			}
			a=a.add(b);
			if(a.toString().length()>80)
				System.out.println("overflow");
			else {
				System.out.println(a.toString());
			}
		}
	}
}