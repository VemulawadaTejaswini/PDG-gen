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

        ArrayList<Long> positive=new ArrayList<>();
        ArrayList<Long> negative=new ArrayList<>();

        for(i=0;i<N;i++)
        {
            if(a[i]>=0) positive.add(a[i]);
            else negative.add(a[i]);
        }

        Collections.sort(positive);
        Collections.sort(negative);

        ArrayDeque<Long> sol=new ArrayDeque<>();
        N=positive.size(); M=negative.size();
        i=N-1; j=0;

        if(K%2==1&&N>0)
        {
            sol.add(positive.get(i--));
            K--;
        }

        while (K>0&&i>0&&j<M-1)
        {
            long tmp=positive.get(i)*positive.get(i-1);
            long tmp2=negative.get(j)*negative.get(j+1);

            if(tmp>tmp2)
            {
                sol.add(positive.get(i));
                sol.add(positive.get(i-1));
                i-=2;
            }
            else
            {
                sol.add(negative.get(j));
                sol.add(negative.get(j+1));
                j+=2;
            }
            K-=2;
        }

        if(K>0&&i==0&&j==M-1)
        {
            sol.add(positive.get(i));
            sol.add(negative.get(j));
            i--; j++; K-=2;
        }

        while (K>0&&i>=0)
        {
            sol.add(positive.get(i));
            sol.add(positive.get(i-1));
            i-=2; K-=2;
        }

        if(K%2==0)
        {
            while (K > 0 && j<M)
            {
                sol.add(negative.get(j));
                sol.add(negative.get(j + 1));
                j += 2;
                K -= 2;
            }
        }
        else
        {
            j=M-1;
            while (K > 0 && j>=0)
            {
                sol.add(negative.get(j));
                j--; K--;
            }
        }

        long ans=1;
        for(long z:sol) ans=(ans*z)%MOD;
        if(ans<0) ans+=MOD;

        System.out.println(ans);
    }
}