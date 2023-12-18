import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
			int d,r;
			double f;
			d=a/b;
			r=a%b;
			f=1.0*a/b;
			System.out.println(String.format("%d %d %.8f",d,r,f));
		scan.close();
}
}
