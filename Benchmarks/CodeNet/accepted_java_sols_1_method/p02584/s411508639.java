

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        long x = Math.abs(s.nextLong());
        long k = s.nextLong();
        long d = s.nextLong();
        long q = x/d;
        long r =  (x%d);
        long r1 =  (d-r);
//        System.out.println(q);
//        System.out.println(r+" "+r1);
        long m;
        if(q>=k)
            m = x-k*d;
        else
        {
            k-=q;
            if(k%2==1)
                m=r1;
            else
                m=r;
        }
        System.out.println(m);
    }
}