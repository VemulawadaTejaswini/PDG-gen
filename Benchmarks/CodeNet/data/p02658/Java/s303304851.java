// created on : Sun May 31 2020
 

import java.io.*;
import java.util.*;

public class B{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        long A[] = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = in.nextLong();
        }
        Arrays.sort(A);
        if(A[0] == 0){
            System.out.println(0);
            return;
        }

        long ans = 1;
        long limit = (long) 1e18;
        for(int i = 0; i < N; i++){
            ans = ans * A[i];
            // println("ans: " + ans);
            if(ans > limit || ans < 0){
                break;
            }
        }
        
        
        if(ans > limit || ans < 0){
            println(-1);
        }
        else{
            println(ans);
        }
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
    
    static String[] readString(int N) throws IOException { 
    	String arr[] = new String[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
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
    
    static void debug(Object ... O) { 
    	for(Object obj: O){
    		System.out.print(obj + " ");
    	}
    	System.out.println();
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