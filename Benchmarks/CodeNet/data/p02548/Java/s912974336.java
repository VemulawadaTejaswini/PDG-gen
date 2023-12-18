import java.util.*;

public class Main
{

    static int sieve[] = new int[1000001];

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        makeSieve();
        int res = 0;
        for(int i = 1 ; i < n ; i++)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            int t = i;
            while(t > 1)
            {
                map.put(sieve[t],map.getOrDefault(sieve[t],0)+1);
                //System.out.println(t + " " + sieve[t]);
                t = t/sieve[t];
            }
            int tot = 1;
            for(int k : map.keySet())
                t = t * (map.get(k) + 1);
            res += t;
        }

        System.out.println(res);

    }
    public static void makeSieve()
    {
        for(int p = 2 ; p*p <= 1000000 ; p++)
        {
            if(sieve[p] == 0)
            {
                sieve[p] = p;
                for(int i = p*p ; i <= 1000000 ; i += p)
                    sieve[i] = p;
            }
        }

        for(int i = 2 ; i <= 1000000 ; i++)
        {
            if(sieve[i] == 0)
                sieve[i] = i;
        }
    }
}