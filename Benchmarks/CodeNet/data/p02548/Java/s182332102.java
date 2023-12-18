import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			int max = N-1;
			int count = 0;
			for (int A = 1; A < N; A++) {
				for (int B = 1; B < N; B++) {
					int tmp = N -(A * B);
					if (tmp > 0) {
						count++;
					} else {
                      break;
                    }
				}
			}
			System.out.println(count);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
