import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        long a[] = new long[n];
        int i;
        for(i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        long sum = 0;
        for(i=n-k-1; i>=0; i--)
        {
            sum += a[i];
        }
        System.out.println(sum);
    }
}