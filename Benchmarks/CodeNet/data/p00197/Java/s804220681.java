import java.util.Scanner;

public class Main {

	static int cnt;
	
	static long gcd(long a, long b){
		if(b==0){
			return a;
		}
		else{
			cnt++;
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			long a = stdIn.nextInt();
			long b = stdIn.nextInt();
			if((a|b)==0){
				return;
			}
			cnt = 0;
			if(a<b){
				long tmp = a;
				a = b;
				b = tmp;
			}
			System.out.println(gcd(a,b)+" "+cnt);
		}
	}
}