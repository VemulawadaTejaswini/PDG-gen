import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int ans = 1;


		for (int i = 0; i < 3 ;i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);


		for (int i = 0; i < 2; i++) {
			if (x[i] != x[i+1]){
				ans++;
			}
		}



		System.out.println(ans);
		sc.close();
	}

}
