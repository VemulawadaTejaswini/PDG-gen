import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class a {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder out = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i=0; i<n; i++) A[i] = Integer.parseInt(in[i]);
        trace(A, n);
        int t;
        for(int i=0; i<n; i++) {
            int minv=i;
            for (int j = i; j <n ; j++) {
				if (A[i]>A[j]) {
					minv=j;
				}
				t=A[i];
				A[i]=A[minv];
				A[minv]=t;
			}
            trace(A, n);
        }
        System.out.print(out);
    }
     
    static void trace(int A[], int n){
        for (int i=0; i<n; i++){
            if(i>0) out.append(' ');
            out.append(A[i]);
        }
        out.append('\n');
    }
}