import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int D = sc.nextInt();
        final int N = sc.nextInt();
        int[] T = new int[D];
        for(int i = 0; i < D; ++i)
        {
            T[i] =  sc.nextInt();
        }
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for(int i = 0; i < N; ++i)
        {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int[][] absum = new int[D][];
        absum[0] = new int[N];
        absum[1] = new int[N];
        for(int j = 0; j < N; ++j)
        {
            if(A[j] <= T[1] && T[1] <= B[j])
            {
                int max_dif = 0;
                for(int prev_j = 0; prev_j < N; ++prev_j)
                {
                    if(A[prev_j] <= T[0] && T[0] <= B[prev_j])
                    {
                        max_dif = Math.max(max_dif, Math.abs(C[j] - C[prev_j]));
                    }
                }
                absum[1][j] = max_dif;
            }
        }
        for(int day = 2; day < D; ++day)
        {
            absum[day] = new int[N];
            for(int j = 0; j < N; ++j)
            {
                if(A[j] <= T[day] && T[day] <= B[j])
                {
                    int max_dif = absum[day - 1][0] + (Math.abs(C[j] - C[0]));
                    for(int prev_j = 1; prev_j < N; ++prev_j)
                    {
                        max_dif = Math.max(max_dif, absum[day - 1][prev_j] + (Math.abs(C[j] - C[prev_j])));
                    }
                    absum[day][j] = max_dif;
                }
            }
        }
        int max_sum = absum[D - 1][0];
        for(int j = 1; j < N; ++j)
        {
            max_sum = Math.max(max_sum, absum[D - 1][j]);
        }
        System.out.println(max_sum);
    }
}