import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        for(int n=K; n<N; n++){
            if(A[n] > A[n-K]) System.out.println("Yes");
            else System.out.println("No");
        }

        
    }
}
