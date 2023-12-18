import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] list = new String[N];
		for(int i = 0; i < N; i++) list[i] = in.next();
		
		BigInteger lcm = new BigInteger(list[0]);
		for(int i = 1; i < N; i++){
			BigInteger a = new BigInteger(list[i]);
			lcm = (lcm.multiply(a)).divide(lcm.gcd(a));
		}
		
		System.out.println(lcm);
		
	}
}