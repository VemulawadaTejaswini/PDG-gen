import java.util.Scanner;

//Four Arithmetic Operations
public class Main{

	long gcd(long a, long b){
		return b==0?a:gcd(b, a%b);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long N = 0, D = 1;
		while(n--!=0){
			int o = sc.nextInt();
			long YN = sc.nextLong();
			if(o==1)N+=YN*D;
			else if(o==2)N-=YN*D;
			else if(o==3){
				long g = gcd(D, Math.abs(YN));
				D/=g; YN/=g;
				N*=YN;
			}
			else {
				long g = gcd(Math.abs(N), Math.abs(YN));
				N/=g; YN/=g;
				D*=YN;
			}
			long g = gcd(Math.abs(N), Math.abs(D));
			N/=g; D/=g;
			if(D<0){
				D*=-1; N*=-1;
			}
		}
		System.out.println(N/D);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}