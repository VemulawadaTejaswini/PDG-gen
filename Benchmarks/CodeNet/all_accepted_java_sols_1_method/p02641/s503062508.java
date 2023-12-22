/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<N; i++)
            hs.add(Integer.parseInt(st.nextToken()));
        int ans=500,a=0;
        for (int i=0; i<200; i++){
            if (hs.contains(i))
                continue;
            if (Math.abs(i-X)<ans){
                ans=Math.abs(i-X);
                a=i;
            }
        }
        System.out.println(a);
    }




}

