import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		System.out.printf("%.8f\n",Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)));
	}

}