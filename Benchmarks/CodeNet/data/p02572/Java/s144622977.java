import java.util.*;
public class Main
{
    public static void main(String args[])
    {

        final int mod = 1000000007;
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++)
            arr[i] = kb.nextInt();

        long res = 0;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n; j++)
            {
                res = (res + (mult((long)arr[i],(long)arr[j]) % mod)) % mod;
            }
        }

        System.out.println(res);
    }
    public static long mult(long a,long b)
    {
        long res = 0;  // initialize result 
  
        while (b > 0) 
        { 
             // If second number becomes odd, add the first number to result 
             if (b%2 == 1) 
                 res = res + a; 
      
             // Double the first number and halve the second number 
             a = a << 1; 
             b = b >> 1; 
         } 
         return res;
    }
   
}