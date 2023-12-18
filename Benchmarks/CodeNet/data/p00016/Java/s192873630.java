import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		double x = 0;
		double y = 0;
		int ang = 90;
		for(;;){
			int d = scan.nextInt();
			int a = scan.nextInt();
			if(d == 0 && a == 0){
				break;
			}
			// x += d * Math.cos(ang * Math.PI / 180);
			//y += d * Math.sin(ang * Math.PI / 180);
			x += d * Math.cos(Math.toRadians((double)ang));
			y += d * Math.sin(Math.toRadians((double)ang));
			ang -= a;
		}
		int X = (int) x;
		int Y = (int) y;
		System.out.printf("%d\n", x);
		System.out.printf("%d\n", y);
	}
}