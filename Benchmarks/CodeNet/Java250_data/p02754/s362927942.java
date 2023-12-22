//package javaapplication2;
import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        long N = Long.parseLong(s[0]);
        long A = Long.parseLong(s[1]);
        long B = Long.parseLong(s[2]);
        System.out.println(solve(N,A,B));  
    }
    
    private static long solve(long N,long blue,long red){
        if(blue == 0) return 0;
        long div = N / (blue + red);
        long rem = N - (blue + red) *  div;
        return blue * div + (rem >= blue ? blue : rem);
    }
}
