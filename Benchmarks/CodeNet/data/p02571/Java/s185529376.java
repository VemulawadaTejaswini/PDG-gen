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
        String x = s.next();
        String t = s.next();
        int max = 0;
        int n = t.length();
        for(int j=0; j<n; j++)
        {
            for(int k=j+1; k<=n; k++)
            {
                if(x.contains(t.substring(j, k)))
                {
                    int length = t.substring(j, k).length();
                    if(length >max)
                        max = length;
                }
            }
        }
        System.out.println(n-max);
    }
}
