import java.util.*;
import java.io.*;

public class Main  {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
    static int[][] Factor;
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
       
        int S = nextInt();
        
        if(S<3){
            System.out.println(0);
            return;
        }

        //build prime map
        int index = 1;
        for (int i=2; i<=S; i++) {
            if(isPrime(i)){
                map.put(index, i);
                index++;
            }
        } 


        Factor = new int[S+1][map.size()+1];
        // each number we convert to prime Factor
        for (int i=2; i<= S; i++) {
            int row = i;
            for (int j=1; j<= map.size(); j++) {
                int prime = map.get(j);
                while(row%prime==0){
                    row = row/prime;
                    Factor[i][j]++;
                }  
                if(row==1){
                    break;
                }
            } 
        } 

        int p = S/3; // max group you can get

        long sum = 0;
        for (int x=1; x<=p; x++) {
            // this is bar and star question
            int temp = S - 3*x; // all number should >=3
            int bar = x - 1;
            sum += Combin(temp+bar,bar);
            sum %= mod;
        }

        System.out.println(sum);
       
    }
  
    public static long Combin(int a, int b) {
        if(b==0) return 1;

        long total = 1;
        int[] result = new int[map.size()+1];
        int loop = Math.min(b, a-b);

        for (int i=a; i>= a-loop+1; i--) {
            for (int j=1; j<= map.size(); j++) {
                result[j] += Factor[i][j];
            } 
        } 
        for (int i=loop; i>= 1; i--) {
            for (int j=1; j<= map.size(); j++) {
                result[j] -= Factor[i][j];
            } 
        } 

        for (int j=1; j<= map.size(); j++) {
            if(result[j]>0){
                for (int x=1; x<= result[j]; x++) {
                    total *= map.get(j);
                    total %= mod;
                }
            }
        } 

        return total;
    }

    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
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