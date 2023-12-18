import java.util.Scanner;

public class Main {
	static int A;
	static int B;
	static int H;
	static int M;
	static double h;
	static double m;
	static double N;
	static double X;
	static double Y;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		H=sc.nextInt();
		M=sc.nextInt();
		h=H*30+M*0.5;
		m=M*6;
		N=Math.abs(h-m);
		N=Math.toRadians(N);
		N=Math.cos(N);
		X=A*A+B*B-2*A*B*N;
		X=Math.sqrt(X);
		System.out.println(X);
	}
}