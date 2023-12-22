

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int max = 0;
        int c = 0;
        for(int j=0; j<str.length(); j++)
        {
            if(str.charAt(j)=='R')
                c++;
            else
            {
                if(c>max)
                    max = c;
                c = 0;
            }
        }
        if(c>max)
            max = c;
        c = 0;
        System.out.println(max);
    }
}