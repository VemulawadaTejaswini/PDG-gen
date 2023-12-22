/* package codechef; // don't place package name! */

import javax.swing.*;
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
        long N = s.nextInt();
        long K = s.nextInt();
        long H[] = new long[(int) N];
        long sum=0;
        for(int i=0; i<N; i++)
        {
            H[i] = s.nextInt();
        }
        Arrays.sort(H);
        for(int i=0; i<N-K;i++)
        {
            sum+=H[i];
        }
        System.out.println(sum);
    }
}
