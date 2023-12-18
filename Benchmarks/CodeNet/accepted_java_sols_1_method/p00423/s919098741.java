import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n;
		int a;
		int b;
		int apoint=0,bpoint=0;
		while(true) {
			n = in.nextInt();
			if(n==0) {
				break;
			}
		for(int i=1; i <= n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			if(a>b) 
				apoint += a+b;
			else if(a==b) {
				apoint += a;
				bpoint += b;
			}
			else {
				bpoint += a+b;
			}
			if(i==n) {
				System.out.println(apoint+ " "+ bpoint);
				apoint=0;
				bpoint=0;
			}
		}
			
		}
	}
}