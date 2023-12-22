import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		double k=scan.nextDouble();
		int cnt=0;
		double c=0;
		while(n-->0) {
			double a=scan.nextDouble();
			double b=scan.nextDouble();
			c=Math.sqrt((a*a)+(b*b));
			//System.out.println(Math.sqrt(c));
			if(c<=k) cnt++;
		}
		System.out.println(cnt);
	}

}
