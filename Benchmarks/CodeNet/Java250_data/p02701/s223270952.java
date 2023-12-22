import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //ArrayList myList = new ArrayList<>();

        int N = nextInt();

        // for(int i = 1; i<=N; i++){
        //     String S = next();
        //     if(!myList.contains(S)){
        //         myList.add(S);
        //     }
        // }
        
        String[] myList = new String[N];

        
        for(int i = 0; i<N; i++){
            String S = next();
            myList[i] = S;
        }

        Arrays.sort(myList);

        int count= 1;
        String Temp = myList[0];
        for(int i = 1; i<N; i++){
            if(!Temp.equals( myList[i])){
                count++;
                Temp = myList[i];
            }
        }

        System.out.println(count);
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