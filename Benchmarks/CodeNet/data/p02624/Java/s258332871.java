import java.util.*;
import java.io.*;
public class Main
{
    public static int find(int n)
    {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0 && n/i != i)
                count+=2;
            else if(n%i==0 && n/i == i)
                count++;
        }
        return count;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        double ans = 0;
        
        //System.out.println(find(108));
        while(n>0)
        {
            //System.out.println("n value:: "+n);
            int div = find(n);
           // System.out.println("div :: " +div);
            ans = ans + div*n;
           // System.out.println(ans);
            n--;
          
        }
        String rounded = String.format("%.0f", ans);
        System.out.println(rounded);
    }
}