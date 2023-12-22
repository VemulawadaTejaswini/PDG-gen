
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		
		long x=0;
		
		if(b<=0 && c<=0) {
			x=a*c;
		}
		else if(a>=0&&d>=0){
			x=b*d;
		}
		else if(b<=0&&c>=0) {
			x=b*c;
		}
		else if(a>=0&&d<=0){
			x=a*d;
		}
		else if(a<=0&&b>=0&&c<=0&&d>=0) {
			if(a*c>=b*d) {
				x=a*c;
			}
			else {
				x=b*d;
			}
		}
		else if(a<=0&&b>=0&&d<=0) {
			x=a*c;
		}
		else if(a<=0&&b>=0&&c>=0) {
			x=b*d;
		}
		System.out.println(x);
		sc.close();
	}
}