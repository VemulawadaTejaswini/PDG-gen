import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);

		int a = stdn.nextInt();
		int b = stdn.nextInt();

		int d = a / b;
		int r = a % b;
		float f =(float) a /(float) b;
		
		System.out.println(d + " " + r + " " + f);
	}
}