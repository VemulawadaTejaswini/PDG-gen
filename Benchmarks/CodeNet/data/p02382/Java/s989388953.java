import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		int c[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
		}
		for(int i=0;i<a;i++) {
			c[i]=scan.nextInt();
		}
		double min=0;
		double man=0;
		double yuu=0;
		double tye=0;
		for(int i=0;i<a;i++) {
			double sa=Math.abs(b[i]-c[i]);
			min+=Math.pow(sa, 1);
			man+=Math.pow(sa, 2);
			yuu+=Math.pow(sa, 3);
			tye=Math.max(tye, sa);
		}
		System.out.println(min);
		System.out.println(Math.pow(man,0.5));
		System.out.println(Math.pow(yuu, 0.33333333333));
		System.out.println(tye);
	}
}
