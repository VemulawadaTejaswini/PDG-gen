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
        HashSet<Long> visited=new HashSet<>();
        visited.add(x);
        long idx=-1L;
        //System.out.println(curr);
        for(long i=2;i<=n;i++)
        {
            curr*=curr;
            curr%=m;
            //System.out.println(curr);
            if(visited.contains(curr))
            {
                idx=i;
                break;
            }
            visited.add(curr);
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
                long ans=0L;
                ans+=(n/(idx-1))*prefix.get(idx-1);
                ans+=prefix.get(n%(idx-1));
                System.out.println(ans);
            }
        }
    }

}
