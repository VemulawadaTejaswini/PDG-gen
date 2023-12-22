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
        String S = s.next();
        String T = s.next();
        if(T.length()==S.length()+1)
        {
            if((S+T.charAt(T.length()-1)).equals(T))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
    }
}
