//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    private static final long MOD=(int)1e9+7;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,j,N,M;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        int K=Integer.parseInt(s[1]);

        s=br.readLine().trim().split(" ");
        long a[]=new long[N];
        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);

        ArrayList<Long> p=new ArrayList<>();
        ArrayList<Long> n=new ArrayList<>();

        for(i=0;i<N;i++)
        {
            if(a[i]>=0) p.add(a[i]);
            else n.add(a[i]);
        }

        Collections.sort(p);
        Collections.sort(n,Collections.reverseOrder());

        ArrayDeque<Long> positive = new ArrayDeque<>(p);
        ArrayDeque<Long> negative = new ArrayDeque<>(n);

        ArrayDeque<Long> sol=new ArrayDeque<>();

        if(K%2==1&&!positive.isEmpty())
        {
            sol.add(positive.pollLast());
            K--;
        }

        while (K>0&&positive.size()>=2&&negative.size()>=2)
        {
            long p1=positive.pollLast(),p2=positive.pollLast();
            long n1=negative.pollLast(),n2=negative.pollLast();

            if(p1*p2>n1*n2)
            {
                negative.addLast(n2);
                negative.addLast(n1);

                sol.addLast(p1);
                sol.addLast(p2);
            }
            else
            {
                positive.addLast(p2);
                positive.addLast(p1);

                sol.addLast(n1);
                sol.addLast(n2);
            }
            K-=2;
        }

        while (K>0&&positive.size()>=2)
        {
            sol.addLast(positive.pollLast());
            sol.addLast(positive.pollLast());
            K-=2;
        }

        if(K>0&&!negative.isEmpty())
        {
            if(K%2==0)
            {
                while (K>0&&!negative.isEmpty())
                {
                    sol.addLast(negative.pollLast());
                    K--;
                }
            }
            else
            {
                while (K>0&&!negative.isEmpty())
                {
                    sol.addLast(negative.pollFirst());
                    K--;
                }
            }
        }

        while (K>0&&!positive.isEmpty())
        {
            sol.addLast(positive.pollLast());
            K--;
        }
        while (K>0&&!negative.isEmpty())
        {
            sol.addLast(negative.pollFirst());
            K--;
        }

        long ans=1;
        for(long z:sol) ans=(ans*z)%MOD;
        if(ans<0) ans+=MOD;

        System.out.println(ans);
    }
}
