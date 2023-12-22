import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int h=sc.nextInt();
	int m=sc.nextInt();
	double angle = Math.abs(h*30+m*0.5-m*6);
	double result = Math.cos(Math.toRadians(angle));
	double x =a*a+b*b-2*a*b*result;
	double ans = Math.sqrt(x);
	System.out.println(ans);
	}
}