import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			int n=scan.nextInt();
			if(n==0) break;
			int s[]=new int[n];
			double sum=0;
			for(int i=0;i<n;i++) {
				s[i]=scan.nextInt();
				sum += s[i];
			}
			double ave=sum/n;
			double a=0;
			for(int i=0;i<n;i++) {
				a += Math.pow(s[i]-ave, 2)/n;
			}
			System.out.println(Math.sqrt(a));
		}
	}
}
