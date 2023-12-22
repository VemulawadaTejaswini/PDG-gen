import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] h = new int[N];

        st  = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }

        List<List<Integer>> g = new ArrayList();

        for (int i=0; i<N; i++) {
        	g.add(new ArrayList());
        }

        for (int i=0; i<M; i++) {
        	st  = new StringTokenizer(br.readLine());

	        int A = Integer.parseInt(st.nextToken())-1;
	        int B = Integer.parseInt(st.nextToken())-1;

	        g.get(A).add(B);
	        g.get(B).add(A);
        }
        
        int ans=0;
        for (int i=0; i<N; i++) {
            boolean good=true;
            for (int x: g.get(i)) {
                if (h[i]<=h[x]) {
                    good=false;
                }
            }
            if (good) {
                ans++;
            }
        }

        System.out.println(ans);

    }

}