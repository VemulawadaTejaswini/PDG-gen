import java.util.Scanner;

//public class Begginer05 {
	public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int sum = 0;
		
		for (int i = 0; i < K ; i++) {
			if (A != 0) {
				sum += 1;
				A -= 1;
			} else if (A == 0 && B != 0) {
				B -= 1;
			} else {
				sum -= 1;
			}
		}
		System.out.println(sum);
	}
}
