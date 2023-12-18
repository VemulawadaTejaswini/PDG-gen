import java.util.Scanner;
public class Main{
	static long gcd(long a,long b){
		while(a!=b){
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	static void lcm(long a,long b,long g){
		System.out.println(g+" "+(a*b/g));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long a=scan.nextInt();
			long b=scan.nextInt();
			long g=0;
			g = gcd(a,b);
			lcm(a,b,g);
		}
		scan.close();
	}

}