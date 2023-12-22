import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] K = new int[N];
        int[][] A = new int[N][M];
        int x = 1;
        int ans = 0;

        for(int i=0; i<N; i++){
            K[i] = sc.nextInt();
            for(int j=0; j<K[i]; j++){
                A[i][j] = sc.nextInt();
            }
        }
        if(N>1){
            for(int i=0; i<M; i++){
                loop:for(int j=1; j<N; j++){
                    for(int k=0; k<K[j]; k++){
                        if(A[0][i]==A[j][k]){
                            x += 1;
                            break;
                        }
                        else if(A[0][i]!=A[j][M-1] && k==M-1){
                            x = 0;
                            break loop;
                        }
                    }
                }
                if(x==N){
                    ans += 1;
                }
                x = 1;
            }
        }
        if(N==1){
            ans = K[0];
        }
        System.out.println(ans);
    }
}