import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();

        int[] lock = new int[N];
        final int undef = 0;
        final int tomat = 1;
        final int cream = 2;
        final int basil = 3;
        for(int i = 0; i < K; ++i)
        {
            lock[sc.nextInt() - 1] = sc.nextInt();
        }

        int[][] date = new int[N][];
        final int tomat_1 = 0;
        final int tomat_2 = 1;
        final int cream_1 = 2;
        final int cream_2 = 3;
        final int basil_1 = 4;
        final int basil_2 = 5;

        date[0] = new int[6];
        if(lock[0] == undef)
        {
            date[0][tomat_1] = 1;
            date[0][cream_1] = 1;
            date[0][basil_1] = 1;
        }
        else
        {
            date[0][(lock[0] == tomat) ? tomat_1 :
                    (lock[0] == cream) ? cream_1 : basil_1]
                = 1;
        }

        for(int i = 1; i < N; ++i)
        {
            date[i] = new int[6];
            final int sum = (date[i - 1][tomat_1] + date[i - 1][tomat_2] + date[i - 1][cream_1] + date[i - 1][cream_2] + date[i - 1][basil_1] + date[i - 1][basil_2]) % 10000;
            switch(lock[i])
            {
            case undef:
                date[i][tomat_1] = sum - date[i - 1][tomat_1] - date[i - 1][tomat_2];
                date[i][tomat_2] = date[i - 1][tomat_1];
                date[i][cream_1] = sum - date[i - 1][cream_1] - date[i - 1][cream_2];
                date[i][cream_2] = date[i - 1][cream_1];
                date[i][basil_1] = sum - date[i - 1][basil_1] - date[i - 1][basil_2];
                date[i][basil_2] = date[i - 1][basil_1];
                break;
            case tomat:
                date[i][tomat_1] = sum - date[i - 1][tomat_1] - date[i - 1][tomat_2];
                date[i][tomat_2] = date[i - 1][tomat_1];
                break;
            case cream:
                date[i][cream_1] = sum - date[i - 1][cream_1] - date[i - 1][cream_2];
                date[i][cream_2] = date[i - 1][cream_1];
                break;
            case basil:
                date[i][basil_1] = sum - date[i - 1][basil_1] - date[i - 1][basil_2];
                date[i][basil_2] = date[i - 1][basil_1];
                break;
            }
        }

        System.out.println(
            (date[N - 1][tomat_1] +
             date[N - 1][tomat_2] +
             date[N - 1][cream_1] +
             date[N - 1][cream_2] +
             date[N - 1][basil_1] +
             date[N - 1][basil_2] )
            % 10000
            );
    }
}