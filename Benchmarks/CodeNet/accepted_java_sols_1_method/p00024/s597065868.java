import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		while(scan.hasNext()){
			double v = scan.nextDouble();
			double t = v / 9.8;
			double y = 4.9 * t * t;
			int N = (int)Math.ceil((4.9 * t * t + 5) / 5);
			System.out.printf("%d\n", N);
		}
	}
}