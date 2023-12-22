import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(), W = sc.nextInt();
		sc.close();

		if (W >= S)
			System.out.println("unsafe");
		else
			System.out.println("safe");
	}

}
