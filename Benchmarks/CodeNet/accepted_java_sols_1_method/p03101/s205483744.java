import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h1=scan.nextInt();
		int w1=scan.nextInt();
		int h2=scan.nextInt();
		int w2=scan.nextInt();
		System.out.println(Math.abs(h1-h2)*Math.abs(w1-w2));

	}

}
