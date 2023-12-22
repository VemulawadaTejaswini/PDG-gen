import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble();
		sc.close();
		double l = L/3;
		System.out.println(Math.pow(l,3));
	}

}