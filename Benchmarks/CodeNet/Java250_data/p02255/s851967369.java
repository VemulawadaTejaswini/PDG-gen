import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.next());
        int[] array = new int [n];
        cin.nextLine();
        for (int i = 0; i < n; i++)
        {
            array[i] = cin.nextInt();
        }
        insertionSort(array, n);

    }

    public static void insertionSort(int[] A, int n)
    {
        int v;
        for(int i = 0; i < n; i++)
        {
            v = A[i];
            int j = i -1;

            while (j >= 0 && A[j] > v)
            {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;

            // ?????????????????????
            for (int z = 0; z < n; z++)
            {
                System.out.print(A[z]);
                if (z != n - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}