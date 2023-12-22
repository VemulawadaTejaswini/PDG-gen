import java.io.*;
import java.util.*;
import java.math.*;


public class Main
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        long num[] = new long[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            num[arr[i]]++;
        }
        long ans = 0;
        for(int i=1;i<=n;i++){
            // System.out.println(num[i]);
            ans += num[i]*(num[i]-1)/2;
        }
        // System.out.println(ans);
        for(int i=1;i<=n;i++){
            long x = ans - (num[arr[i]] - 1);
            System.out.println(x);
        }
    }

}
