import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        long A []  = new long[N+1];
        long B [] = new long[M+1];
        A[0] = 0;
        B[0] = 0;
        for(int i=1;i<=N;i++) A[i] = A[i-1]+sc.nextLong();
        for(int i=1;i<=M;i++) B[i] = B[i-1]+sc.nextLong();
        int max = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(A[i]+B[j]<=K&&i+j>max) max = i+j;
            }
        }
        System.out.println(max);
    }
}