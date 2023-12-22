/*
 * @Author: Kaustav Vats  
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;


class Main {

    public static void PrintIntArray(int[] Arr) {
        for (int i=0; i<Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        int N = Reader.nextInt();
        long[] Arr = new long[N+1];
        long[] Brr = new long[N];
        for (int i=0; i<=N; i++) {
            Arr[i] = Reader.nextLong();
        }
        for (int i=0; i<N; i++) {
            Brr[i] = Reader.nextLong();
        }
        long count = 0;
        int i = 0;
        
        while(i < N) {
            if (Arr[i] < Brr[i]) {
                count += Arr[i];
                Brr[i] -= Arr[i];
                Arr[i] = 0;
                if (Arr[i+1] > Brr[i]) {
                    count += Brr[i];
                    Arr[i+1] -= Brr[i];
                }
                else {
                    count += Arr[i+1];
                    Brr[i] -= Arr[i+1];
                    Arr[i+1] = 0;
                }
            }
            else {
                count += Brr[i];
                Brr[i] = 0;
            }
            i++;
        }
        System.out.println(count);
    }
}


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}