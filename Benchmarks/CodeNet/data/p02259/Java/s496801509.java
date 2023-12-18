import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.next());
        int[] array = new int[n];
        cin.nextLine();
        for (int i = 0; i < n; i++)
        {
            array[i] = cin.nextInt();
        }

        int cnt = bubbleSort(array, n);
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i]);
            if (i != n - 1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(cnt);
    }

    // Return : count
    public static int bubbleSort(int[] A, int N)
    {
        int cnt = 0;

        int flag = 1;
        while (flag == 1)
        {
            flag = 0;
            for (int j = N - 1; j > 0; j--)
            {
                if (A[j] < A[j - 1])
                {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                    flag = 1;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}