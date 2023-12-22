import java.util.*;

class Main
{
    public static int swap(int a, int b)
    {
        return a;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a[] = new int[4];
        for (int t = 0; t < 10; t++)
        {
            a[3] = input.nextInt();
            for (int i = 2; i >= 0; i--)
            {
                if (a[i] < a[i+1])
                {
                    a[i+1] = swap(a[i], a[i]=a[i+1]);
                }
            }
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println(a[i]);
        }
        input.close();
    }
}