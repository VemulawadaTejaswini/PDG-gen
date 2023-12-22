import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();//a
		int b=scan.nextInt();//b
		int c=scan.nextInt();//間
		double cos=Math.cos(Math.toRadians(c));//cos A
		double d=Math.sqrt(b*b+a*a-2*a*b*cos);//c
		double l=a+b+d;
		double ad=b*cos;
		double h=Math.sqrt(b*b-ad*ad);
		double S=a*h/2;
		System.out.println(S+" "+l+" "+h);
	}
}
