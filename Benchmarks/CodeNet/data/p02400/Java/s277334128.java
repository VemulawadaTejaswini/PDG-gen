import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float r = scanner.nextFloat();
		System.out.printf("%.6f %.6f",r*r*Math.PI , 2*r*Math.PI);
		scanner.close();
	}

}