import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		float B = scan.nextFloat();

		long ans = (A * ((long)(B * 100 + 0.5))) / 100;

		System.out.println(ans);

	}
}