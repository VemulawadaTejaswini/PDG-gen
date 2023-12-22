import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		String[] in = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(in[i]);
		int   sw = 0;

	        int t, min;
	        for(int i=0; i<n; ++i) {
	            min=i;
	            for(int j=i; j<n; ++j) {
	                if(A[j]<A[min])  min = j;
	            }
	            if(i!=min) {
	                t = A[i];
	                A[i] = A[min];
	                A[min] = t;
	                ++sw;
	            }
	        }
		for (int k = 0; k < n; k++) {
			if (k > 0)
				System.out.print(" ");
			System.out.print(A[k]);
		}
		System.out.print("\n");
		System.out.println(sw);
	}
}