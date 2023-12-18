import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		
		isnectionSort(input, n);

	}

	private static void isnectionSort(int[] A, int N) {

		show(A, " ");
		
		for (int i = 1; i < N; i++) {
			int v = A[i];
			int j = i - 1;
			
			while(j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			
			show(A, " ");
			
		}
	}

	private static void show(int[] a, String joiner) {

		String line = Arrays.stream(a)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(joiner));
		
		System.out.println(line);
		
	}
}