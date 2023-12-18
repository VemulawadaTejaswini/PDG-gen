import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextLong();
		double n = 100;
		int i = 0;
		while (x > n) {
			n = n * 1.01;
			n = Math.floor(n);
			i++;
			//System.out.println(n);

		}
		System.out.println(i);

	}

}
