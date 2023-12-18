import java.io.*; 
import java.util.*; 
  
public class Main
{ 
    static int MAX = 1000001; 
  
    // structure to store queries 
    static class Query  
    { 
        int l, r, idx; 
    } 
  
    // updating the bit array 
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
  
    static void answeringQueries(int[] arr, int n,  
                                Query[] queries, int q) 
    { 
  
        // initialising bit array 
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
  
        // holds the rightmost index of any number 
        // as numbers of a[i] are less than or equal to 10^6 
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
  
        // answer for each query 
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 

            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n); 

            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
  
            // If i is equal to r of any query store answer 
            // for that query in ans[] 
            while (query_counter < q && queries[query_counter].r == i)  
            { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
  
        // print answer for each query 
        for (int i = 0; i < q; i++) 
            System.out.println(ans[i]); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  throws Exception
    { 
        Scanner sc = new Scanner(System.in);

        int N, Q;
        N = sc.nextInt();
        Q = sc.nextInt();
  	    int arr[] = new int[N+1];
  	    for(int i=0; i<N; i++) arr[i] = sc.nextInt();
  	    Query[] queries = new Query[Q+1]; 
  	    for(int i=0; i<Q; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            queries[i].l = L;
            queries[i].r = R;
            queries[i].idx = i;
        }
        
        //answeringQueries(arr, N, queries, Q); 
       
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
        answeringQueries(arr, N, queries, Q); 
    } 
} 
 