import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger sqsum = BigInteger.valueOf(0);

		for(int i=0;i<N;i++) {
			int A = sc.nextInt();
			BigInteger bigA = BigInteger.valueOf(A);
			sum = sum.add(bigA);
			sqsum = sqsum.add(bigA.pow(2));
		}
		BigInteger sumsq = sum.pow(2);
		BigInteger d = (sumsq.subtract(sqsum)).divide(BigInteger.valueOf(2));

		BigInteger ans = d.mod(BigInteger.valueOf(1000000007));

		System.out.println(ans);
	}
}
