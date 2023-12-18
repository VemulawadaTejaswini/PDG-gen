import java.io.*;
import java.util.*;

public class Main {
    public static int MAX = 1000001;
    public static PrintWriter out;
    static class Query
    {
        public int l, r, idx;
        public Query(int l, int r, int idx){
            this.l=l;
            this.r=r;
            this.idx=idx;
        }
    }

    static void update(int idx, int val,
                       int bit[], int n)
    {
        for (; idx <= n; idx += idx & -idx)
            bit[idx] += val;
    }

    // querying the bit array
    static int query(int idx, int bit[], int n)
    {
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx)
            sum += bit[idx];
        return sum;
    }

    static void answer(int[] arr, int n,
                                 Query[] queries, int q)
    {

        int[] bit = new int[n + 1];
        Arrays.fill(bit, 0);

        int[] last_visit = new int[MAX];
        Arrays.fill(last_visit, -1);
        
        int[] ans = new int[q];
        int qcount = 0;
        for (int i = 0; i < n; i++)
        {
            
            if (last_visit[arr[i]] != -1)
                update(last_visit[arr[i]] + 1, -1, bit, n);


            last_visit[arr[i]] = i;
            update(i + 1, 1, bit, n);

            while (qcount < q && queries[qcount].r == i)
            {
                ans[queries[qcount].idx] =
                        query(queries[qcount].r + 1, bit, n)
                                - query(queries[qcount].l, bit, n);
                qcount++;
            }
        }

        for (int i = 0; i < q; i++)
            out.println(ans[i]);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(f.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Query[] queries = new Query[q];
        for(int i = 0; i < q; i++){
            st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            queries[i] = new Query(a, b, i);
        }

        Arrays.sort(queries, new Comparator<Query>()
        {
            public int compare(Query x, Query y)
            {
                if (x.r < y.r)
                    return -1;
                else if (x.r == y.r)
                    return 0;
                else
                    return 1;
            }
        });
        answer(arr, n, queries, q);
        out.close();
    }
}