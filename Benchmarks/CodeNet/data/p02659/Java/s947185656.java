import java.util.Scanner;

public class ABC169C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long A = sc.nextLong();
      	double B = sc.nextDouble();

      	long result = Math.floor((long)A * B);

		System.out.println(result);

	}
}