import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con=0;
		int max = 0;
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < N; i++) {
			if (arr[i-1] - arr[i] >= 0) {
				con++;
			}else {
				max = Math.max(max, con);
				con = 0;
			}
		}

		max = Math.max(max, con);

		System.out.println(max);
	}

}