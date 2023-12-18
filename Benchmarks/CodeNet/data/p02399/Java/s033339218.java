import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(a/b+" "+a%b+" ");
		double a_=(double)a;
		double b_=(double)b;
		System.out.println(String.format("%.8f",a_/b_));
	}
}

