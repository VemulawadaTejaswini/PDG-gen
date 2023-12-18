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
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long x=in.nextLong();
        long m=in.nextLong();
        long curr=x;
        HashMap<Long,Long> prefix=new HashMap();
        prefix.put(1L,x);
        HashMap<Long, Long> visited=new HashMap<>();
        visited.put(x,1L);
        long idx=-1L;
        //System.out.println(curr);
        for(long i=2;i<=n;i++)
        {
            curr*=curr;
            curr%=m;
            //System.out.println(curr);
            if(visited.containsKey(curr))
            {
                idx=i;
                break;
            }
            visited.put(curr,i);
            if(curr==0)
            {
                idx=i;
                break;
            }
            prefix.put(i, prefix.get((i-1))+curr);
        }
        if(curr==0)
            System.out.println(prefix.get(idx-1));
        else
        {
            if(idx==-1L)
            {
                System.out.println(prefix.get(n));
            }
            else
            {
                long idx1=visited.get(curr); //idx-idx1 = cycle size
                long ans=prefix.get(idx1-1);
                ans+=(prefix.get(idx-1)-prefix.get(idx1-1))*((n-idx1+1)/(idx-idx1));
                ans+=prefix.get(idx1+(n-idx1+1)%(idx-idx1)-1)-prefix.get(idx1-1);
                System.out.println(ans);
            }
        }
    }

}
