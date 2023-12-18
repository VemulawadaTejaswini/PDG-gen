/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int min=Integer.MAX_VALUE;
        for(int i=0;i+2<s.length();i++){
            min=Math.min(min,Math.abs(753-Integer.parseInt(s.substring(i,i+3))));
        }
        System.out.println(min);
    }
}
