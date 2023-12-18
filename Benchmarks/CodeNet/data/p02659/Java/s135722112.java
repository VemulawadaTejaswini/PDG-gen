import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

public class Main {
    // driver function to test the above functions
    public static void main(String args[]) throws IOException {

        Reader.init(System.in);


        Double n1 = Reader.nextDouble();
        Double n2 = Reader.nextDouble();

        Double ans = n1*n2;
        ans =Math.floor(ans);
        Long t = ans.longValue();
        System.out.println(t.toString());



    }

}

class Node_compare implements Comparator<Node>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Node n1, Node n2)
    {
        if(n1.min-n2.min==0){
            return (int)(n1.max-n2.max);
        }
        return (int)(n1.min-n2.min);


    }
}

class Node{
    long min;
    long max;


}



class solu{

    int bin (int[][] arr, int l, int r, int val){
        while(r-l>1){
            int m = l+((r-l)/2);
            if (arr[m][0]>=val){
                r=m;
            }
            else {
                l=m;
            }
        }
        return r;
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

    static String line() throws IOException {
        return reader.readLine();
    }
}