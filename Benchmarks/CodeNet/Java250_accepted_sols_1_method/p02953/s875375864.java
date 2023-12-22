import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]H = new int[N];

		for (int i=0; i<N; i++){
			H[i] = sc.nextInt();
		}

		for (int i=1; i<N; i++){
			if (i == 1){
				H[0]--;
			} else {
				if (H[i-1] -1 >= H[i-2]){
					H[i-1]--;
				}
			}
		}
		int[] H1 = H.clone();
		Arrays.sort(H);
		if (Arrays.equals(H, H1)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}