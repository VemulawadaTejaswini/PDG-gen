// created on : Sun Jun 21 2020
 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        long n = in.nextLong();
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            long mod = (n - 1) % 26;
            sb.append((char) (mod + 97));
            if(n % 26 == 0){
                n = n/26 - 1;
            }
            else{
                n = n / 26;
            }
        }
        println(sb.reverse().toString());
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static int[] readInt(int N) throws IOException { 
    	int arr[] = new int[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    	return arr;
    }
    
    static long[] readLong(int N) throws IOException { 
    	long arr[] = new long[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    	return arr;
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i] + " "); 
    	} 
    	println(""); 
    }
    
    static void displayRuntime(long startTime){
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Runtime: " + elapsedTime / 1000D);
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}
