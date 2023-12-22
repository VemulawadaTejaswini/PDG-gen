import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt[] = new int[n];

        for (int i = 0; i < n; i++)
            cnt[sc.nextInt()]++;

        boolean flag = true;
        for (int i = 1; i < n && flag; i++)
            if (cnt[i] % 2 != 0)
                flag = false;

        if (flag)
        {
            int ans = 1;
            for (int i = 1; i < n; i++)
                if (cnt[i] == 2)
                {
                    ans *= 2;
                    ans %= (int) 1e9 + 7;
                }
            System.out.println(ans);
        } else
            System.out.println(0);
    }
}
