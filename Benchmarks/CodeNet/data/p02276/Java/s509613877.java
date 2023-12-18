import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		int[] A = new int[n];
		String[] array = br.readLine().split(" ");
		for (int i=0; i < n; i++) {
			A[i] = Integer.parseInt(array[i]);
		}

		int x = A[n-1];
		int i = -1;
		int temp;
		for (int j=0; j <= n-2; j++) {
			if (A[j] <= x) {
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		temp = A[i+1];
		A[i+1] = A[n-1];
		A[n-1] = temp;

		StringBuilder sb = new StringBuilder();
		sb.append(A[0]);
		for (int j=1; j < i+1; j++) {
			sb.append(" " + A[j]);
		}

		sb.append(" [" + A[i+1] + "]");

		for (int j=i+2; j < n; j++) {
			sb.append(" " + A[j]);
		}
		System.out.println(sb);
	}

}