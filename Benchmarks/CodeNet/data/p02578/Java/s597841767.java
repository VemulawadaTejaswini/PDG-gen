

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
        int[] h = new int[n];
        long sum = 0;
        for(int j=0; j<n; j++)
            h[j] = s.nextInt();

        for(int j=1; j<n; j++)
        {
            if(h[j-1]>h[j])
            {
                sum+=h[j-1]-h[j];
                h[j] = h[j-1];
            }
        }
        System.out.println(sum);
    }
}