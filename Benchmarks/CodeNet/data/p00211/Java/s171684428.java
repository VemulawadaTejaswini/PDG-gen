import java.util.*;
import java.math.BigInteger;

public class Main {
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			BigInteger[][] dv = new BigInteger[n][2];
			BigInteger m = BigInteger.ONE;
			for(int i=0;i<n;i++){
				dv[i][0] = new BigInteger(sc.next());
				dv[i][1] = new BigInteger(sc.next());
				m = m.multiply(dv[i][0]);
			}
			BigInteger GCD = BigInteger.ONE;
			for(int i=0;i<n;i++){
				dv[i][1] = dv[i][1].multiply(m).divide(dv[i][0]);
				if(i==0) GCD = GCD.multiply(dv[i][1]);
				else GCD = GCD.gcd(dv[i][1]);
			}
			for(int i=0;i<n;i++) System.out.println(dv[i][1].divide(GCD));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}