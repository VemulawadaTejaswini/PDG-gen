import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double C=sc.nextDouble();

		double c=Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(C)));

		double s=a*b*Math.sin(Math.toRadians(C))/2;
		double L=a+b+c;
		double h=b*Math.sin(Math.toRadians(C));

		System.out.printf("%.8f\n",s);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);

		sc.close();
	}

}

