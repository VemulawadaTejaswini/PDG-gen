import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double v = sc.nextDouble();
			System.out.println((int) Math.ceil(v*v/98) + 1);
		}
	}

}