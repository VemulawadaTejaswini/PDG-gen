import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//?????°?¨????
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;


		while(sc.hasNext()) {
			double num = sc.nextDouble();
			max = Math.max(max, num);
			min = Math.max(min, num);
		}

		System.out.println(max - min);
	}

}