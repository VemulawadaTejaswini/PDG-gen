import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if ((N & 1) == 0)
			System.out.println(N);
		else
			System.out.println(N << 1);
	}
}
