import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double PI = 3.141592653589;
		
		int r = in.nextInt();
		
		System.out.printf("%.6f %.6f",(2*PI*r),(r*r*PI));
	}

}