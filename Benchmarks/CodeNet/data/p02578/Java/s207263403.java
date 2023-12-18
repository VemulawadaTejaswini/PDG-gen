import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			int N = Integer.valueOf(sc.nextLine());

			long[] nums = new long[N];
			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}

			long diffSum = 0;
			long d = 0;
			for (int j = 1; j < N; j++) {
				d = nums[j] - nums[j -1];
				if (d > 0) {
					diffSum += d;
				}
			}

			System.out.println(diffSum);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
