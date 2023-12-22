import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int sum =0;
		if (A>B) {
			sum +=B;
		} else {
			sum +=A;
		}
		if (C>D) {
			sum +=D;
		} else {
			sum +=C;
		}
		System.out.println(sum);
	}
}