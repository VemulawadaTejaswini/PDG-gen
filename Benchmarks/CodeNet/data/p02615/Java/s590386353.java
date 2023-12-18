package abc173;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();

			Integer[] a = new Integer[n];

			for(int i = 0; i < n; i++ ) {
				a[i] = sc.nextInt();
			}


			Arrays.sort(a, Collections.reverseOrder());


			int ans = 0;

			for(int i = 1, j = 1; i < a.length; i++) {
				j = i / 2;
				ans += a[j];
				//System.out.println(ans + " "+ a[j] + " " + i +  " " + j);
			}




			System.out.println(ans);



		}
	}
}
