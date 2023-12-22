import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = 1000000000;
		double max = 0;
		while(sc.hasNext()) {
			double d = sc.nextDouble();
			min = Math.min(min, d);
			max = Math.max(max, d);
		}
		sc.close();
		System.out.printf("%.5f", max - min);
	}
}
