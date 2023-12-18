import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int T = in.nextInt();
        for (int i=0;i<T;i++) {
        	int N = in.nextInt();
        	int[] K = new int[N];
        	int[] L = new int[N];
        	int[] R = new int[N];
        	ArrayList<int[]> left = new ArrayList<int[]>();
        	ArrayList<int[]> right = new ArrayList<int[]>();
        	long ans = 0L;
        	int[] imos_l = new int[N+1];
        	int[] imos_r = new int[N+1];
        	for (int j=0;j<N;j++) {
        		K[j] = in.nextInt();
        		L[j] = in.nextInt();
        		R[j] = in.nextInt();
        		if (L[j]>=R[j]) {
        			int[] add = {K[j], L[j]-R[j]};
        			left.add(add);
        			ans += L[j];
        			imos_l[0]++;
        			imos_l[K[j]]--;
        		} else {
        			int[] add = {N-K[j], R[j]-L[j]};
        			right.add(add);
        			ans += R[j];
        			imos_r[N]++;
        			imos_r[K[j]]--;
        		}
        	}
        	for (int j=0;j<N;j++) {
        		imos_l[j+1] = imos_l[j+1]+imos_l[j];
        	}
        	for (int j=N;j>0;j--) {
        		imos_r[j-1] = imos_r[j-1]+imos_r[j];
        	}
        	Collections.sort(left, (o1, o2)->Integer.compare(o2[1], o1[1]));
        	Collections.sort(right, (o1, o2)->Integer.compare(o2[1], o1[1]));
        	Collections.sort(left, (o1, o2)->Integer.compare(o1[0], o2[0]));
        	Collections.sort(right, (o1, o2)->Integer.compare(o1[0], o2[0]));

        	// out.println("imos_l: "+(Arrays.toString(imos_l)));
        	// out.println("imos_r: "+(Arrays.toString(imos_r)));
        	int left_out_ind = -1;
        	int left_out_cnt = -1;
        	PriorityQueue<int[]> pq_l = new PriorityQueue<int[]>((o1, o2)->Integer.compare(o1[1], o2[1]));
        	int l_minus = 0;
        	for (int j=left.size()-1;j>=0;j--) {
        		pq_l.add(left.get(j));
        		if (left.size()-j > imos_l[j]+l_minus) {
        			left_out_ind = j;
        			left_out_cnt = (left.size()-j)-imos_l[j]-l_minus;
        			// left_out_cnt = (left.size()-j)-imos_l[j];
        			// out.println("j: "+j);
        			// System.out.println("pq_l.peek(): "+pq_l.peek()[1]);
        			ans -= pq_l.poll()[1];
        			// l_minus++;
        		}
        	}
        	// out.println("left_out_ind: "+(left_out_ind));
        	// out.println("left_out_cnt: "+(left_out_cnt));

        	int right_out_ind = -1;
        	int right_out_cnt = -1;
        	PriorityQueue<int[]> pq_r = new PriorityQueue<int[]>((o1, o2)->Integer.compare(o1[1], o2[1]));
        	int r_minus = 0;
        	for (int j=right.size()-1;j>=0;j--) {
        		pq_r.add(right.get(j));
        		if (right.size()-j > imos_r[N-j]+r_minus) {
        			// right_out_ind = j;
        			// right_out_cnt = (right.size()-j)-imos_r[N-j]-r_minus;
        			// System.out.println("pq_r.peek(): "+pq_r.peek()[1]);
        			ans -= pq_r.poll()[1];
        			// r_minus++;
        		}
        	}
        	// out.println("right_out_ind: "+(right_out_ind));
        	// out.println("right_out_cnt: "+(right_out_cnt));

        	// for (int[] arr : left) {
        	// 	out.println(Arrays.toString(arr));
        	// }
        	// out.println("#####");
        	// for (int[] arr : right) {
        	// 	out.println(Arrays.toString(arr));
        	// }
        	// out.println("#####");
        	out.println(ans);
        }

		out.close();
	}

	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
