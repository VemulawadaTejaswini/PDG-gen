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
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();
        int k = s.nextInt();
        int min_ct = 0;
        if(m2-1<m1+1)
        {
            min_ct+=-(m1+1)+(m2-1)+(h2-h1)*60;
            System.out.println((min_ct/k)*k);
        }
        else
        {
            min_ct+=(m2-1)-(m1+1)+(h2-h1)*60;
            System.out.println((min_ct/k)*k);
        }
    }
}
