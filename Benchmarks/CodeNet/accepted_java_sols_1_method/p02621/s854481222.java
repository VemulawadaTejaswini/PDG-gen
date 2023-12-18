import java.util.Scanner;

// ABC172-
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();

		System.out.println(a + a * a + a * a * a);
		sc.close();
	}

}
