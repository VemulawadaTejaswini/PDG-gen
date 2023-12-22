import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A, B, T;
			A = sc.nextInt();
			B = sc.nextInt();
			T = sc.nextInt();
			
			int sum = 0;
			
			for (int time = 1; time <= T; time++) {
				if (time % A == 0) {
					sum += B;
				}
			}
			System.out.println(sum);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}