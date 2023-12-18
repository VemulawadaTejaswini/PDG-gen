import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

        long[][] A = new long[N][N];
        long[][] B = new long[N][N];


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = sc.nextInt();
                B[i][j] = A[i][j];
            }
        }

        long ans = 0;;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    if( A[i][j] + A[i][k] < A[j][k] || Math.abs( A[i][j] - A[i][k] ) > A[j][k] ){
                        ans = -1;
                        break;
                    }
                    else if(A[i][j] + A[j][k] == A[i][k] && j != k && j != i && i != k){
                        B[i][k] = 0;
                    }
  //                  System.out.println("B[" + i + "][" + j + "]:" + B[i][j]);
                }
            }
        }
        if(ans == 0){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    ans += B[i][j];
                }
            }
            ans /= 2;
        }

        System.out.println(ans);
    }
}