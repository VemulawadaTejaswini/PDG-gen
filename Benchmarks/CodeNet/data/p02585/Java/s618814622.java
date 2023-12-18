import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] P=new int[n+1];
        long[] C=new long[n+1];
        for(int i=1;i<=n;i++)
            P[i]=in.nextInt();
        for(int i=1;i<=n;i++)
            C[i]=in.nextLong();
        long max_ans=Long.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            int j=P[i];
            long score=C[j];
            long ans=score;
            int steps=1;
            long[] prefix=new long[n+1];
            prefix[steps]=score;
            while(j!=i)
            {
                j=P[j];
                steps++;
                score+=C[j];
                prefix[steps]=Math.max(prefix[steps-1],score);
                ans=Math.max(ans,score);
            }
            if(steps<k && score>0)
            {
                int y=k/steps;
                long tmp=score*y;
                int mod=(k%steps)==0?steps:k%steps;
                ans=Math.max(ans,tmp+prefix[mod]);
            }
            else
                ans=prefix[k];
            max_ans=Math.max(max_ans, ans);

        }
        System.out.println(max_ans);
    }
}
