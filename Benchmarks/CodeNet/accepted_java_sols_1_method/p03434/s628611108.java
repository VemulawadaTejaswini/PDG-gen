import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a, Comparator.reverseOrder());
			int Alice = 0;
			int Bob = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					Alice += a[i];
				} else {
					Bob += a[i];
				}
			}
			
			System.out.println(Alice - Bob);
		}

	}

}