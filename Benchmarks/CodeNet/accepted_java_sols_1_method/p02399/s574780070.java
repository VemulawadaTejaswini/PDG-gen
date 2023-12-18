import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d,r;
		double f,x,y;

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print(d = a/b);
		System.out.print(" ");
		System.out.print(r = a%b);
		System.out.print(" ");
		x = a;
		y = b;
	//	System.out.print(f = x/y);
		f=x/y;
		System.out.printf("%f",f);


	}
}
