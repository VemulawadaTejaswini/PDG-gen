import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N], v = new int[N];
        for(int i = 0; i < N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] x = new long[W+1][N];
        x[0][0] = 0;
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < N; j++){
                if(j == 0){
                    if(i >= w[0]) x[i][0] = v[0];
                    else x[i][0] = 0;
                }
                else if(i >= w[j]){
                    x[i][j] = Math.max(x[i][j-1], x[i - w[j]][j - 1] + v[j]);
                }
                else{
                    x[i][j] = x[i][j-1];
                }
            }
        }
        System.out.println(x[W][N-1]);
    }
}