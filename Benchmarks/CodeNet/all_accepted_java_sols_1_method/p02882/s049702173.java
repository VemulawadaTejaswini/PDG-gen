import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double a=stdIn.nextInt();
		double b=stdIn.nextInt();
		double x=stdIn.nextInt();
		double ans=0;
		if(x>a*a*b/2){
			x=a*a*b-x;
			ans=x*2/(a*a);
			System.out.println(Math.toDegrees(Math.atan(ans/a)));
		}
		else{
			ans=x*2/(b*a);
			System.out.println(Math.toDegrees(Math.atan(b/ans)));
		}
	}
}