import java.util.*;
import java.io.*;
public class DistanceFromOrigin {
    public static void main(String[] args) throws IOException {
            final FastReader reader = new FastReader();
            final StringBuilder result = new StringBuilder();
            final Helper helper = new Helper();
            final Solver solver = new Solver(helper , reader);
            int t = 1;
            while(t-- > 0) {
                //Basic test case input and data management
                
                result.append(solver.solve(reader.nextInt(), reader.nextInt())).append("\n");
            }
            System.out.println(result);
        }
    
    
        private static class Solver {
            final Helper helper;
            final FastReader reader;
            Solver(Helper helper , FastReader reader) {
                this.helper = helper;
                this.reader = reader;
            }
            
            
            public String solve(int n, int d){
                int c = 0;
                for (int i = 0; i< n; i++) {
                    long x = reader.nextInt();
                    long y = reader.nextInt();
                    double distance = Math.sqrt(x*x + y*y);
                    if (distance <= d) {
                        c++;
                    }
                }
                return ""+c;
            }
        }
    
    
        /*
         * Helper Classes
         */
        //Utility class
        private static class Helper {
        
            //+-----------------Array Related functions-------------------------+
            public long sum(int[] arr) {
                long sum = 0;
                for (int val : arr )
                    sum+=val;
                return sum;
            }
        
            public long sum(long[] arr) {
                long sum = 0;
                for (long val : arr )
                    sum+=val;
                return sum;
            }
            
            public int max(int[] arr) {
                int max = Integer.MIN_VALUE;
                int l = arr.length;
                for (int value : arr) {
                    if (value > max) {
                        max = value;
                    }
                }
                return max;
            }
        
            public long max(long[] arr) {
                long max = Long.MIN_VALUE;
                int l = arr.length;
                for (long value : arr) {
                    if (value > max) {
                        max = value;
                    }
                }
                return max;
            }
        
            public int min(int[] arr) {
                int min = Integer.MAX_VALUE;
                int l = arr.length;
                for (int value : arr) {
                    if (value < min) {
                        min = value;
                    }
                }
                return min;
            }
        
            public long min(long[] arr) {
                long min = Long.MAX_VALUE;
                int l = arr.length;
                for (long value : arr) {
                    if (value < min) {
                        min = value;
                    }
                }
                return min;
            }
        
            public int freqOf(int entry , int[] arr) {
                int freq = 0;
                for (int value : arr) {
                    if (value == entry) {
                        freq++;
                    }
                }
                return freq;
            }
        
            public long freqOf(long entry , long[] arr) {
                long freq = 0;
                for (long value : arr) {
                    if (value == entry) {
                        freq++;
                    }
                }
                return freq;
            }
        
            public int firstIndexOf(int entry , int[] arr) {
                int l = arr.length;
                for (int i = 0 ; i < l ; i++) {
                    if(entry == arr[i]){
                        return i;
                    }
                }
                return -1;
            }
        
            public int firstIndexOf(long entry , long[] arr) {
                int l = arr.length;
                for (int i = 0 ; i < l ; i++) {
                    if(entry == arr[i]){
                        return i;
                    }
                }
                return -1;
            }
        
            public int lastIndexOf(int entry , int[] arr) {
                int l = arr.length;
                for (int i = l-1 ; i >= 0 ; i--) {
                    if(entry == arr[i]){
                        return i;
                    }
                }
                return -1;
            }
        
            public int lastIndexOf(long entry , long[] arr) {
                int l = arr.length;
                for (int i = l-1 ; i >= 0 ; i--) {
                    if(entry == arr[i]){
                        return i;
                    }
                }
                return -1;
            }
            //------------------Array Related functions--------------------------
            
            //+-----------------Numbers Related functions-----------------------+
            public int gcd(int a , int b) {
                if (b == 0)
                    return a;
                else
                    return gcd( b , a%b);
            }
        
            public long gcd(long a , long b) {
                if (b == 0)
                    return a;
                else
                    return gcd( b , a%b);
            }
        
            public long lcm(int a , int b) {
                return (a*b)/gcd(a,b);
            }
        
            public long lcm(long a , long b) {
                return (a*b)/gcd(a,b);
            }
        
            
        }
        //Fast Reader
        private static class FastReader {
            BufferedReader br;
            StringTokenizer st;
        
            public FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        
            public String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }
        
            public void resetST() {
                st = null;
            }
        
            public int nextInt() {
                return Integer.parseInt(next());
            }
        
            public long nextLong() {
                return Long.parseLong(next());
            }
        
            public double nextDouble() {
                return Double.parseDouble(next());
            }
        
            public float nextFloat() {
                return Float.parseFloat(next());
            }
        
            public String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                st = null;
                return str;
            }
        
            public int[] nextIntArray(int size) {
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = nextInt();
                }
                return arr;
            }
        
            public long[] nextLongArray(int size) {
                long[] arr = new long[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = nextLong();
                }
                return arr;
            }
        
            public double[] nextDoubleArray(int size) {
                double[] arr = new double[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = nextDouble();
                }
                return arr;
            }
        }
}
