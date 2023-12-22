import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int N = sc.nextInt();
		
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		
		int swap = 0;
		for(int i=0; i<N; i++){
			int idx_min = i;
			for(int j=i; j<N; j++){
				if(A[j] < A[idx_min]){
					idx_min = j;
				}
			}
			
			if(idx_min != i){
				int temp = A[i];
				A[i] = A[idx_min];
				A[idx_min] = temp;
				swap++;
			}
		}

		for(int i=0; i<N; i++){
			System.out.print(A[i]);
			if(i != N-1){
				System.out.print(" ");
			}
		}
		System.out.println();
		
		System.out.println(swap);
	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}