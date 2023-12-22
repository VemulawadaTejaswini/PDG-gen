import java.util.Scanner;

/**
 * 2019/06/16
 * AtCoder Beginner Contest 130
 * 
 * C - Rectangle Cutting
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double result1 = W * H / 2;
		int result2;
		if((W / 2 == x) && (H / 2) == y) {
			result2 = 1;
		} else {
			result2 = 0;
		}
		
		System.out.println(result1 + " " + result2);
	}
	
}