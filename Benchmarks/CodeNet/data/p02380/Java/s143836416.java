import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int C=sc.nextInt();

		System.out.printf("%f\n",Size(a,b,C));
		System.out.printf("%f\n",Length(a,b,C));
		System.out.printf("%f",height(b,C));

	}

	private static double Size(int a,int b,int C) {
		return a*b*Math.sin(Math.toRadians(C))/2;
	}

	private static double Length(int a,int b,int C) {
		double c=0;
		c=Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(C)));
		return a+b+c;
	}

	private static double height(int b,int C) {
		return b*Math.sin(Math.toRadians(C));
	}

}
