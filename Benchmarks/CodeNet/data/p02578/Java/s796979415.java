import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {
    static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();
        
        long step = 0;
        long highest = 0;
        for(int n=0; n<N; n++){
            step += Math.max(0, highest-A[n]);
            highest = Math.max(highest, A[n]);
            
        }
        System.out.println(step);
    }
}
