import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] L = new int[N];
		for(int i=0; i<N; i++) {
			L[i] = scan.nextInt();
		}

		scan.close();
		
		Arrays.sort(L);
		
		int sum = 0;
		for(int i=0; i<N-1; i++) {
			sum +=L[i];
		}

		if(L[N-1]<sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}