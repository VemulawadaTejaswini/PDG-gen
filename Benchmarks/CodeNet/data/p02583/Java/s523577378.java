

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int j=0; j<n ;j++)
        {
            a[j] = s.nextInt();
        }
        int x = 0;
        int y = 0;
        int c = 0;
        for(int i=0; i<n-2; i++)
        {
            x = a[i];
            for(int j=i+1; j<n-1; j++)
            {
                if(a[j]!=a[i])
                {
                    y = a[j];
                    int sum = x+y;
                    for(int k = j+1; k<n; k++)
                    {
                        if(a[k]!=x&&a[k]!=y&&sum>a[k])
                            c++;
                    }
                }
                else
                    break;
            }
        }
        System.out.println(c);
    }
}