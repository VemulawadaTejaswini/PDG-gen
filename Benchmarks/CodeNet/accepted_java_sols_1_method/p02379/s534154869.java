
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		double x1=cin.nextDouble(),y1=cin.nextDouble(),x2=cin.nextDouble(),y2=cin.nextDouble();
		System.out.println(Math.sqrt(Math.pow((x2-x1), 2.0)+Math.pow((y2-y1), 2.0)));
	}
	
	
	
}
