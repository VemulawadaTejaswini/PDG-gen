import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		float fa = Integer.parseInt(x[0]);
		float fb = Integer.parseInt(x[1]);
		System.out.print(a / b + " ");
		System.out.print(a % b + " ");

		System.out.println(fa / fb);

	}

}