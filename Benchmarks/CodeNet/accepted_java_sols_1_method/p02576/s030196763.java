

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
        int x =s.nextInt();
        int t = s.nextInt();
        int q;
        if(n%x==0)
            q = n/x;
        else
            q = n/x+1;
        System.out.println(q*t);
    }
}