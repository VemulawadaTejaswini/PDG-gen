import java.util.Arrays;
import java.util.Scanner;
public class Main { //A

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		int ans = 0;

		for(int i=0; i<3; i++) {
			A[i] = sc.nextInt();
		}Arrays.sort(A);
		ans += A[2]-A[1];
		ans += A[1]-A[0];

		System.out.println(ans);
	}

}
