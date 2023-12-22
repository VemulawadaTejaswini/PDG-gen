import java.util.Scanner;
class Main{
    public static void main(String[] args){
		double r;
		final double pi=3.141592653589;
		double s,l;
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		s=r*r*pi;
		l=2*r*pi;
		System.out.println(String.format("%.6f",s)+" "+String.format("%.6f",l));
    }
}
