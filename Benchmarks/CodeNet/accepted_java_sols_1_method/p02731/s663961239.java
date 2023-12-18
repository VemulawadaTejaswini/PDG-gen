import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		
		double vol = Math.pow(l / 3.0, 3);
		System.out.printf("%8f\n", vol);
	}
}
