import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int[][] BC = new int[M][2];
        for(int i=0;i<M;i++){
            BC[i][0] = sc.nextInt();
            BC[i][1] = sc.nextInt();
        }
        Arrays.sort(BC, (a,b)->a[1]-b[1]);

        int m = M-1;
        int n = N-1;
        int count = 0;
        long total = 0;
        while(count < N){
            int b = BC[m][0];
            int c = BC[m][1];
            while(b>0 && n>=0 && count < N){
                count++;
                if(c<=A[n]){
                    total += A[n];
                    n--;
                }
                else{
                    total += c;
                    b--;
                }
            }
            m--;
            if(m<0){
                while(count < N){
                    count++;
                    total += A[n];
                    n--;
                }
                break;
            }
        }
        System.out.println(total);
    }
}