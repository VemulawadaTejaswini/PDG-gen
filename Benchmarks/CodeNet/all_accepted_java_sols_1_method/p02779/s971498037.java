import java.util.Arrays;
import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int A[] = new int[N];
 		int count = 0;
  		for (int i = 0; i < N; i++) {
  			int x = scanner.nextInt();
  			A[i] = x;
  		}
  		Arrays.sort(A);

  		for (int i = 0; i < N - 1; i++) {
  			if (A[i] == A[i + 1]) {
  				count += 1;
  				break;
  			}
  		}
  		if (count == 1) {
  			System.out.println("NO");
  		} else {
  			System.out.println("YES");
  		}
 	}
}
