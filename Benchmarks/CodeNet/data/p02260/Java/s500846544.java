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
		int i, j, t, minv,sw=0;

		for (i = 0; i < n-1; i++) {
			minv = i;
			for (j = i; j < n; j++) {
				if (A[minv] > A[j]) {
					minv = j;
				}
				if(i!=minv){
				t = A[i];
				A[i] = A[minv];
				A[minv] = t;
				sw++;
			   }
			}
		}
        out.append(A[0]);
        for(int v=1; v<n; v++)
            out.append(' ').append(A[v]);
        out.append('\n');
        out.append(sw).append('\n');
        System.out.print(out);
	}
}