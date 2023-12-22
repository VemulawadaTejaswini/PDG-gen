import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double W = stdIn.nextDouble();
		double H = stdIn.nextDouble();
		double x = stdIn.nextDouble();
		double y = stdIn.nextDouble();
		
		System.out.println(W*H/2);
		
		if(x == W/2 && y == H/2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}

}