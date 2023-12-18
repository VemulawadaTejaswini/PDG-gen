import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x1 = stdIn.nextDouble();
		double y1 = stdIn.nextDouble();
		double x2 = stdIn.nextDouble();
		double y2 = stdIn.nextDouble();
		System.out.printf("%.5f",Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),(double)1/2));
		System.out.println();
	}
}