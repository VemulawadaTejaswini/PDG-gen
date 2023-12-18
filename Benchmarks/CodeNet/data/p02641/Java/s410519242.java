/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int[] d = new int[n];
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
            d[i] = Math.abs(a[i]-x);
        }
        for(int i=0; ; i++)
        {
            if(Objects.equals(a, x - (i)))
            {
                System.out.println(x-(i+1));
                break;
            }
            else if(Objects.equals(a, x + (i)))
            {
                System.out.println(x+(i+1));
                break;
            }
        }
    }
}
