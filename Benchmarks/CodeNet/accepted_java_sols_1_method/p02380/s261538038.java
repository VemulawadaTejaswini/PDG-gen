import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		double d=Math.cos(Math.toRadians(c));
		double e=Math.sin(Math.toRadians(c));
		double S=0,L=0,h=0,t=0;
		
		t=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*d));
		S=(a*b*e)/2;
		L=a+b+t;
		h=b*e;
		System.out.printf("%.11f\n",S);
		System.out.printf("%.11f\n",L);
		System.out.printf("%.11f\n",h);
		scan.close();
	}
}

