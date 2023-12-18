import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        int[] Res = solve2(A, N, K);
        for(int i=0;i<N;i++){
            System.out.print(Res[i] + " ");
        }

    }

    public static int[] solve2(int[] A, int N, int K){
        for(int i=0;i<K;i++){
            int[] B = new int[N];
            for(int j=0;j<N;j++){
                add2(B, j-A[j], j+A[j]);
            }
            int now=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<N;j++){
                now += B[j];
                A[j] = now;
                min = Math.min(A[j], min);
            }
            if(min >= N){
                return A;
            }
        }
        return A;
    }

    public static void add2(int[] B, int s ,int e){
        s = Math.max(s, 0);
        e = Math.min(e, B.length-1);
        B[s] ++;
        if(e < B.length-1)
            B[e+1] --;
    }




    public static int[] solve(int[] A, int N, int K){
        for(int i=0;i<K;i++){
            int[] B = new int[N];
            for(int j=0;j<N;j++){
                add(B, j-A[j], j+A[j]);
            }
            A = B;
        }
        return A;
    }

    public static void add(int[] B, int s ,int e){
        s = Math.max(s, 0);
        e = Math.min(e, B.length-1);
        for(int i=s;i<=e;i++){
            B[i]++;
        }
    }

}
