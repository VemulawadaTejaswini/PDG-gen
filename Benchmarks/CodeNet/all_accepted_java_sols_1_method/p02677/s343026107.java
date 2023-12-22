import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		double A=stdIn.nextInt();
		double B=stdIn.nextInt();
		double H=stdIn.nextInt();
		double W=stdIn.nextInt();
		double a=W*6-(H*30+W*0.5);
		a=Math.abs(a);
		if(a>180)
			a=360-a;
		System.out.println(Math.sqrt((A*A+B*B)-2*A*B*Math.cos(Math.toRadians(a))));
	}
}
