import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		double f;
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a%b;
		f=(double)a/b;
		System.out.print(d+" "+r+" ");
		System.out.printf("%.5f",f);
		// TODO Auto-generated method stub

	}
}