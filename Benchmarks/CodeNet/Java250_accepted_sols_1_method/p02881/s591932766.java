import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		long a;
		while(sc.hasNextLong()) {
			a=sc.nextLong();
		double m=Math.sqrt(a);
		long n;
		n=(long)m;
		for(long i=n;i>0;i--) {
			if(a%i==0) {
				System.out.println(i+a/i-2);
				break;
			}
		}
		}	
	}
}