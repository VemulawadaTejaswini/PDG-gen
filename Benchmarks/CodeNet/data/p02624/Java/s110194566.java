
import java.util.*;
public class Main {
    static long count(long n) 
    { 
        long count=0;
        for (long i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) 
                   ++count;
       
                else
                   count+=2; 
            } 
        } 
        return count;
    } 

    public static void main(String args[])
    {
        long ans=0;
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        for(long i=N;i>0;--i)
        {
            ans+=(i*count(i));
        }
        System.out.println(ans);
    }
    
}