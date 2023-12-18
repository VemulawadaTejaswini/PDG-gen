
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int a=cin.nextInt(),b=cin.nextInt(),C=cin.nextInt();
		System.out.println(a*b*Math.sin(Math.toRadians(C))/2);
		System.out.println((a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(Math.toRadians(C)))));
		System.out.println(b*Math.sin(Math.toRadians(C)));
	}
	
	
	
}
