import java.util.*; 
import java.io.*;

//brute force
public class Main  {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = nextInt();
        
        int[] List = new int[N+1];
        for (int i=1; i<=N; i++) {
            List[i] = nextInt(); 
        }

        int count = 0;
        for (int i=1; i<=N-2; i++) {
            for (int j=i+1; j<=N-1; j++) {
                for (int k=j+1; k<=N; k++) {
                    count += GetCount(List[i],List[j],List[k]);
                }
            }   
        }

        System.out.println(count);
    }
    
    public static int GetCount(int i, int j, int k)  {
        if(i==j || j==k || k==i){
            return 0;
        }

        if(i+j<=k || j+k<=i || k+i<=j){
            return 0;
        }

        return 1;
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}
