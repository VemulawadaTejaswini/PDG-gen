import java.util.Scanner;

public class Main {

	static int n;
	static int m;
	static int a[], b[];
	static boolean visited[];
	static boolean graph[][];

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(2*b -a);
		}
	}
}
