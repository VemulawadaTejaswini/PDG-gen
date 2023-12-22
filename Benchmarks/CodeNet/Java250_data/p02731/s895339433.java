
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextLong();
		double l = n/3;
		System.out.printf("%.12f\n",Math.pow(l, 3));
		sc.close();
	}


}
