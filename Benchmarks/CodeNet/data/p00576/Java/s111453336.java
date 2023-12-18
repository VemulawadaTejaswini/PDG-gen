import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int masu[] = new int[N];
        for(int i = 0 ; i < N ; i++)
            masu[i] = sc.nextInt();
        int M = sc.nextInt();
        int move[] = new int[M];
        for(int i = 0 ; i < M ; i++)
            move[i] = sc.nextInt();
        for(int i = 0 ; i < M ; i++)
        {
            if(move[i] == N)
            {
                if(masu[move[i] - 1] < 2019)
                    masu[move[i] - 1]++;
            }
            else
            {
                if(masu[move[i] - 1] + 1 != masu[move[i]])
                    masu[move[i] - 1]++;
            }
        }
        for(int i = 0 ; i < N ; i++)
            System.out.println(masu[i]);
    }
}
