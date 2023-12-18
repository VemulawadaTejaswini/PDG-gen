import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] n = line.split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);

		System.out.print((a * b) + " ");
		System.out.print(a * 2 + b * 2);

	}

}

