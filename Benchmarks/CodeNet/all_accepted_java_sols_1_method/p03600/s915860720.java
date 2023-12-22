import java.util.*;

class Main{
    private static int[][] ab;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N+1][N+1];
        //int[][] B = new int[N+1][N+1];
        for(int row=1;row<=N;row++){
            for(int col=1;col<=N;col++){
                A[row][col] = sc.nextInt();
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    if(A[j][k]>A[j][i]+A[i][k]){
                        System.out.println(-1);
                        System.exit(0);
                    }
                }
            }
        }
        long ans = 0;
        for(int i=1;i<N;i++){
            for(int j=i+1;j<=N;j++){
                boolean flag = true;
                for(int k=1;k<=N;k++){
                    if(k==i||k==j) continue;
                    if(A[i][j]==A[i][k]+A[k][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) ans += A[i][j];
            }
        }
        System.out.println(ans);

    }
}