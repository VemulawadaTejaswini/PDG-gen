import java.util.*;
public class Main
{
    public static void main(String args[])
    {

        final long mod = 1000000007;
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        long arr[] = new long[n];

        for(int i = 0 ; i < n ; i++)
            arr[i] = kb.nextLong();

        long res = 0;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n; j++)
            {
                res = (res + ((arr[i] * arr[j]) % mod)) % mod;
            }
        }

        System.out.println(res);
    }
   
}