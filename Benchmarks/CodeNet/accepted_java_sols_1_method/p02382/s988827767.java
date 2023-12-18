import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		double a1=0;
		double a2=0;
		double a3=0;
		double max=0;
		int x[]=new int[a];
		int y[]=new int[a];
		for(int i=0;i<a;i++) {
			x[i]=scan.nextInt();
		}for(int i=0;i<a;i++) {
			y[i]=scan.nextInt();
		}
		for(int i=0;i<a;i++) {
			a1 += Math.abs(x[i]-y[i]);
		}System.out.println(a1);
		for(int i=0;i<a;i++) {
			a2 +=Math.pow(Math.abs(x[i]-y[i]), 2);
		}System.out.println(Math.sqrt(a2));
		for(int i=0;i<a;i++) {
			a3 +=Math.pow(Math.abs(x[i]-y[i]), 3);
		}System.out.println(Math.cbrt(a3));
		for(int i=0;i<a;i++) {
			a1 =Math.abs(x[i]-y[i]);
			max=Math.max(a1, max);
		}System.out.println(max);
	}
}
