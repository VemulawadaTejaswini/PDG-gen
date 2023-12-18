import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = Math.max(a, b);

		if (max > 8){
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}
