import java.util.*;

public class Main {

	long GCD(long m, long n){
		if(n>m){
			long l = m;
			m=n;
			n=l;
		}		
		while(n!=0){
			long l = n;
			n = m%n;
			m = l;
		}
		return m;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			long[][] dv = new long[n][2];
			long lcm = 1;
			for(int i=0;i<n;i++){
				dv[i][0] = sc.nextLong();
				dv[i][1] = sc.nextLong();
				lcm = (lcm/GCD(lcm, dv[i][0]))*dv[i][0];
			}
			long gcd = 0;
			for(int i=0;i<n;i++){
				dv[i][1] = (lcm/dv[i][0])*dv[i][1];
				if(i==0) gcd = dv[i][1];
				else gcd = GCD(gcd, dv[i][1]);
			}
			for(int i=0;i<n;i++) System.out.println(dv[i][1]/gcd);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}