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
        int d = s.nextInt();
        int t = s.nextInt();
        int sp = s.nextInt();
        double tt = d/sp;
        if(tt<=t)
            System.out.println("Yes");
else
            System.out.println("No");
    }
}
