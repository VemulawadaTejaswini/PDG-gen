import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            int N = sc.nextInt(), P = sc.nextInt();
            if (N==0 && P==0) break;
             
            int[] s = new int[N];
            for (int n = 0; ; n = (n + 1) % N)
            {
                if (P != 0)
                {
                    P--;
                    s[n]++;
                    if (P == 0)
                    {
                        boolean win = true;
                        for (int i = 0; i < N; i++)
                        {
                            if (i != n && s[i] != 0)
                            {
                                win = false;
                                break;
                            }
                        }
                        if (win)
                        {
                            System.out.println(n);
                            break;
                        }
                    }
                }
                else
                {
                    P = s[n];
                    s[n] = 0;
                }
            }
        }
    }
}