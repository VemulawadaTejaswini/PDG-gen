
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a=scn.nextLong();
		long b=scn.nextLong();
		long c=scn.nextLong();
		long d=scn.nextLong();
		if(c%d==0) {
			if(d>a) {
				System.out.println(b-a+1-(b/d));
			}else {
				System.out.println(b-a+1-(b/d-a/d+(a%d!=0?0:1)));
			}
		}else if(d%c==0) {
			if(c>a) {
				System.out.println(b-a+1-(b/c));
			}else {
				System.out.println(b-a+1-(b/c-a/c+(a%c!=0?0:1)));
			}
		}else {
			if(c>a&&d>a) {
				System.out.println(b-a+1-b/c-b/d+b/(c*d));

			}else if(c>a) {
				System.out.println(b-a+1-b/c-(b/d-a/d+(a%d!=0?0:1))+b/(c*d));

			}else if(d>a) {
				System.out.println(b-a+1-(b/c-a/c+(a%c!=0?0:1))-b/d+b/(c*d));

			}else {
				System.out.println((long)(b-a+1-(b/c-a/c+(a%c!=0?0:1))-(b/d-a/d+(a%d!=0?0:1))+b/(lcm(c,d))-a/(lcm(c,d))+((a%(lcm(c,d))!=0&&a>c*d)||a<lcm(c,d)?0:1)));

			}
		}
	}
	static long lcm(long a, long b){
		return a / gcd(a,b) * b;
	}
	static long gcd(long a, long b){
		if(a<b){
			a^=b;
			b^=a;
			a^=b;
		}
		if(a%b==0){
			return b;
		}else{
			return gcd(b,a%b);
		}
	}
}
