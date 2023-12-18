

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
        int x = 1;
        for(int j=0; j<n ;j++)
            a[j] = s.nextInt();
        Arrays.sort(a);
        for(int j=1; j<n; j++)
        {
            if(a[j]!=a[j-1])
                x++;
        }
        System.out.println(x);
        int[][] d = new int[x][2];
        d[0][0] = a[0];
        x = 1;
        int r = 1;
        for(int j=1; j<n; j++)
        {
            if(a[j]!=a[j-1])
            {
                d[x][0] = a[j];
                d[x-1][1] = r;
                r = 1;
                x++;
            }
            else
                r++;
        }
        d[x-1][1] = r;
//        for(int j=0; j<d.length; j++)
//            System.out.println(d[j][0]+" "+d[j][1]);
        int c = 0;
        for(int i=0; i<d.length-2; i++)
        {
            for(int j=i+1; j<d.length-1; j++)
            {
                for(int k=j+1; k<d.length; k++)
                {
                    if(d[i][0]+d[j][0]>d[k][0])
                        c+=d[i][1]*d[j][1]*d[k][1];
                }
            }
        }
        System.out.println(c);
    }
}