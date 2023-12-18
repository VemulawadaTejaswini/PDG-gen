import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int d = 1;
		ArrayList<Integer> G = new ArrayList<Integer>();
		while(d < n) {
			G.add(d);
			d = d * 3 + 1;
		}
		Collections.reverse(G);
		int m = G.size();
		for(int i=0; i<m; i++) {
			cnt += insertionSort(A, n, G.get(i));
		}
		
		System.out.println(m);
		
		for(int i=0; i<m; i++) {
			System.out.print(G.get(i));
			if(i != m-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		System.out.println(cnt);
		
		for(int i=0; i<n; i++) {
			System.out.println(A[i]);
		}
	}
	
	static int insertionSort(int[] A, int n, int g){
		int cnt = 0;
		for(int i=g; i<n; i++) {
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j+g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j+g] = v;
		}
		return cnt;
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