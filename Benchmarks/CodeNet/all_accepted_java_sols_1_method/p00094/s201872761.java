import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt(), b = sc.nextInt();
		
		double tsubo = a * b / 3.305785;
		
		System.out.println(String.format("%6f", tsubo));
	}
}