import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
  
public class Main {
	private static int N;
	private static int[] A;
    public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		String[] arrays = br.readLine().split(" ");
		A = new int[N];
		for (int i = 0, idx = 0; i < arrays.length; i++) {
			if(arrays[i].length() == 0) continue;
			A[idx++] = Integer.parseInt(arrays[i].trim());
		}
  
        System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        }
    }
}