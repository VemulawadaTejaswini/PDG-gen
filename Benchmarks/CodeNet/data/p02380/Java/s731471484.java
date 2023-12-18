
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
	
		System.out.println(Math.sin(Math.toRadians(c))*a*b/2);
		System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c)))+a+b);
		System.out.println(Math.sin(Math.toRadians(c))*b);
	}
}