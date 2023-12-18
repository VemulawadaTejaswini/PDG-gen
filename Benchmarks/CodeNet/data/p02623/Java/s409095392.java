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
        int cnt = 0;
        for(int i=0;i<=N;i++){
            if(A[i]>K)break;
            int min = 0,max = M+1;
            int mid = M/2;
            long r = K-A[i];
            int bmid = 0;
            while(mid<max){
                bmid= mid;
                if(B[mid]<=r) min = mid+1;
                else max = mid;
                mid = (min+max)/2;
            }
            if(cnt<bmid+i) cnt = bmid+i;
        }
        System.out.println(cnt);
    }
}