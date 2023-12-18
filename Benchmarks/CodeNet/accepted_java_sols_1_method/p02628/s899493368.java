import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();
        Arrays.sort(A);
        int ans = 0;
        for(int n=0; n<K; n++) ans += A[n];
        System.out.println(ans);
        
    }
}
