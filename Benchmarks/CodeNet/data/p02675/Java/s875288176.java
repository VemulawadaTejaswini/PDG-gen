import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
        static Stack<Integer> subset = new Stack<>();
        static String input = "";
        static int stop = 0;
        static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        static HashMap<Integer,Integer> map = new HashMap<>();
        static ArrayList<String> list = new ArrayList<>();
        
       
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
       int N = ms.nextInt();
    
       N%=10;
       pw.println(N==3?"bon":(N==0||N==1||N==6||N==8)?"pon":"hon");
        pw.flush();
    }


   

    static class IP {
        int r,c;
        IP(int r, int c){
            this.r =r ;
            this.c =c ;
        }
    }

    /**
     * 1.What is the unknown: the maxium number of nodes he can buy 2.What are the
     * data: the size of the array and element int he array 3.What is the condition:
     * the longest increasing usbsequece 4.What is the restriction: the 100,000 *100
     * = 100,000,000 = thus made N^2 for 3 second
     */

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
   
        String nextLine(){
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