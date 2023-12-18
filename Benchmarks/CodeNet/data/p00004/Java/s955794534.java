import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		float x,y;
		
		while(sc.hasNext()){
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			float d = sc.nextFloat();
			float e = sc.nextFloat();
			float f = sc.nextFloat();
			
			a = a * d;
			b = b * d;
			c = c * d;
			d = d * a;
			e = e * a;
			f = f * a;
			
			y = (c - f) / (b - e);
			x = (c - b * y) / a;
			
			System.out.println(x+" "+y);
		}
	}
}