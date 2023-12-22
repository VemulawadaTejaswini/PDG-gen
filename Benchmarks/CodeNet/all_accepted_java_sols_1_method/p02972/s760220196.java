import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[N];
		for(int i = 0; i < N; i++)
		{
			b[i] = 0;
		}
		int sum = 0;
		for(int i = N; i > (N+ 1) / 2; i--)
		{
			if(a[i-1] == 0)
			{
				b[i-1] = 0;
			}
			else
			{
				b[i-1] = 1;
			}
		}
		for (int i = (N+1)/2; i > 0; i--)
        {
            int temp = 0;
            for(int j = 1; j * i <= N; j++)
            {
                if(b[j*i-1] == 1)
                {
                    temp++;
                }
            }
            if (temp % 2 == 1)
            {
                if (a[i - 1] == 1)
                {
                    b[i - 1] = 0;
                }
                else
                {
                    b[i - 1] = 1;
                }
            }
            else
            {
                if (a[i - 1] == 1)
                {
                    b[i - 1] = 1;
                }
                else
                {
                    b[i - 1] = 0;
                }
            }
        }
        for(int i = 0; i < N; i++)
        {
            if(b[i] == 1)
            {
                sum++;
            }
        }
        System.out.println(sum);
        for (int i = 0; i < N; i++) {
            if(b[i] == 1)
            {
                System.out.println(i + 1);
            }
        }

		sc.close();
	}

}