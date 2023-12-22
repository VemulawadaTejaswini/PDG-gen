
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A[] = new int[Integer.parseInt(br.readLine())];
		Scanner scanner = new Scanner(br.readLine());
		for(int i=0; i<A.length; i++) {
			A[i] = scanner.nextInt();
		}
		scanner.close();

		for(int i=0; i<A.length; i++) {
			int v = A[i];
			int j = i-1;
			while(j>=0 && A[j]>v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;

			System.out.printf("%d", A[0]);
			for(int k=1; k<A.length; k++) {
				System.out.printf(" %d",A[k]);
			}
			System.out.println();
		}
	}

}

