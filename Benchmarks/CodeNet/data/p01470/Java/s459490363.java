import java.math.BigInteger;
import java.util.Scanner;

//Four Arithmetic Operations
public class Main{

	long gcd(long a, long b){
		return b==0?a:gcd(b, a%b);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		long N = 0, D = 1;
		BigInteger N = BigInteger.ZERO, D = BigInteger.ONE;
		while(n--!=0){
			int o = sc.nextInt();
//			long YN = sc.nextLong();
			BigInteger YN = sc.nextBigInteger();
			if(o==1){
				N = N.add(YN.multiply(D));
//				N+=YN*D;
			}
			else if(o==2){
				N = N.subtract(YN.multiply(D));
//				N-=YN*D;
			}
			else if(o==3){
				N = N.multiply(YN);
//				long g = gcd(D, Math.abs(YN));
//				BigInteger g = D.gcd(val)
//				D/=g; YN/=g;
//				N*=YN;
			}
			else {
				D = D.multiply(YN);
//				long g = gcd(Math.abs(N), Math.abs(YN));
//				N/=g; YN/=g;
//				D*=YN;
			}
//			long g = gcd(Math.abs(N), Math.abs(D));
//			N/=g; D/=g;
//			if(D<0){
//				D*=-1; N*=-1;
//			}
		}
		System.out.println(N.divide(D));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}