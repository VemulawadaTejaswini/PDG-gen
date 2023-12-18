import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		//?????°?¨????
		Scanner sc = new Scanner(System.in);
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;


		while(sc.hasNext()) {
			double num = sc.nextDouble();
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		System.out.println(max - min);
	}

}