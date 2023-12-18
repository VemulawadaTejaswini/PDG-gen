import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double PI = 3.141592653589;
		
		double r = in.nextDouble();
		
		System.out.printf("%.5f %.5f",(2*PI*r),(r*r*PI));
	}

}