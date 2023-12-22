import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();

        long allXor = 0;
        for(int n=0; n<N; n++) allXor ^= A[n];

        for(int n=0; n<N; n++){
            System.out.print(allXor^A[n]);
            if(n+1<N) System.out.print(" ");
            else System.out.println();
        }
        
    }
}
