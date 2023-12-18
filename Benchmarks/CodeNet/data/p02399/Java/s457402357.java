import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a/b;
		int r = a%b;
		double before = a/b;
		String f = String.format("%.5f", before);
		System.out.println(d + " " + r + " " + f);
	}

}