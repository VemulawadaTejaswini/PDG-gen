import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		System.out.println(Math.pow((double)len/3 , 3));

		sc.close();
	}
}
