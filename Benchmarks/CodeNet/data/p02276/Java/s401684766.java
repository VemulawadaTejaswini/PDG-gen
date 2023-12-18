import java.io.*;

public class Algo22{

	public static void main(String[] args) throws IOException{

		int i, q;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

		String[] in = br.readLine().split(" ");
		for(i = 0; i < n; i++){
			A[i] = Integer.parseInt(in[i]);
		}

		q = partition(A, 0, n-1);

		StringBuffer sb = new StringBuffer();
		for(i = 0; i < n; i++){
			if(i != 0)
				sb.append(" ");
			if(i == q)
				sb.append("[");
			sb.append(A[i]);
			if(i == q)
				sb.append("]");
		}
		System.out.println(sb);
	}

	public static int partition(int[] A, int p, int r){
		int x, i, j, t;
		x = A[r];
		i = p-1;
		for(j = p; j < r; j++){
			if(A[j] <= x){
				i++;
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		t = A[i+1];
		A[i+1] = A[r];
		A[r] = t;
		return i+1;
	}
}