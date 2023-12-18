import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        int[] yPoint = new int[y+1];
        Arrays.fill(yPoint, 0);
        int[] xPoint = new int[x+1];
        Arrays.fill(xPoint, 0);

        boolean[][] map = new boolean[y+1][x+1];
        for (int i = 0;i<map.length;++i) Arrays.fill(map[i],false);

        for (int i = 0;i<m;++i)
        {
            int mY = sc.nextInt();
            int mX = sc.nextInt();
            ++yPoint[mY];
            ++xPoint[mX];
            map[mY][mX] = true;
        }

        //debug{{
        for (int yy = 1;yy<map.length;++yy)
        {
            StringBuilder debugMap = new StringBuilder();
            for (int xx = 1;xx<map[yy].length;++xx)
            {
                debugMap.append(map[yy][xx] + " ");
            }
            System.err.println(debugMap.toString());
        }
        System.err.println();

        for (int i = 1;i<yPoint.length;++i) System.err.println(yPoint[i]);
        System.err.println();
        StringBuilder stb = new StringBuilder();
        for (int i = 1;i<xPoint.length;++i) stb.append(xPoint[i] +" ");
        System.err.println(stb.toString());
        System.err.println();
        //}}

        sc.close();

        int yMax = -1;
        List<Integer> yms = new ArrayList<>();
        for (int i = 1;i<yPoint.length;++i)
        {
            if (yMax < yPoint[i])
            {
                yMax = yPoint[i];
                yms.clear();
                yms.add(i);
            }else if (yMax == yPoint[i]) yms.add(i);
        }

        int xMax = -1;
        List<Integer> xms = new ArrayList<>();
        for (int i = 1;i<xPoint.length;++i)
        {
            if (xMax < xPoint[i])
            {
                xMax = xPoint[i];
                xms.clear();
                xms.add(i);
            }else if (xMax == xPoint[i]) xms.add(i);
        }

        boolean flag = false;
        for (Integer yy:yms)
        {
            for (Integer xx:xms)
            {
                if (!map[yy][xx])
                {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

        if (flag) System.out.println(yMax + xMax);
        else System.out.println(yMax + xMax - 1);

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}

class Pair<F,S>
{
    private final F first;
    private final S second;

    Pair(F first,S second)
    {
        this.first = first;
        this.second = second;
    }

    public void print() { System.out.println("("+this.first+","+this.second+")"); }

    //get
    public F first() {return this.first;}
    public S second() {return this.second;}

    @Override
    public boolean equals(Object object)
    {
        if (object instanceof Pair)
        {
            Pair pair = (Pair)object;
            return this.first==pair.first && this.second==pair.second;
        }else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(first,second);
    }
}

class BIT
{
    int []bit;
    int n;
    public BIT(int n) {
        this.n = n;
        bit = new int[n + 1];
    }
    int sum(int i) {
        int sum = 0;
        while(i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }
    void add(int i, int x) {
        while(i <= n) {
            bit[i] += x;
            i += i & -i;
        }
    }
}

class Compute
{
    long combination(int n,int r)//nCrの組み合わせの解(int) returnはlongにする
    {
        int denominator = 1;//分母
        int molecule = 1;//分子

        int loop = 0;

        for (int i = 1;i<=r;++i)
        {
            denominator *= i;
            ++loop;
        }

        int tmp = n;
        for (int i = 0;i<loop;++i)
        {
            molecule *= tmp;
            --tmp;
        }
        //System.out.println(molecule+"C"+denominator);
        return molecule/denominator;
    }

    long combination(long n,long r)//nCrの組み合わせの解(long)
    {
        long denominator = 1;//分母
        long molecule = 1;//分子

        long loop = 0;

        for (long i = 1;i<=r;++i)
        {
            denominator *= i;
            ++loop;
        }

        long tmp = n;
        for (long i = 0;i<loop;++i)
        {
            molecule *= tmp;
            --tmp;
        }
        //System.out.println(molecule+"C"+denominator);
        return molecule/denominator;
    }

    int cumulativeSum(int A[],int k)//kの大きさごとに配列Aを切り取ってその区間内の数を足した時の最大値をreturn
    {
        int ans=0;
        //累積和表を作成
        int B[]=new int[A.length+1];//累積和に使う配列
        B[0]=0;
        for(int i=1;i<B.length;i++)
        {
            B[i]=B[i-1]+A[i-1];
        }

        //最大値を求める
        int tmp=0;
        ans=B[k]-B[0];
        for(int i=1;i<A.length-k;i++)
        {
            tmp=B[i+k]-B[i];
            if(tmp>ans)
            {
                ans=tmp;
            }
        }
        System.out.println(Arrays.toString(B));
        return ans;
    }

    public int gcd(int x,int y)//ユークリッドの互除法を使って2値の最大公約数を求める(int)
    {
        int tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }

    public static long gcd(long x,long y)//ユークリッドの互除法を使って2値の最大公約数を求める(long)
    {
        long tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }

    public int leastCommonMultiple(int a,int b)//最小公倍数(int)
    {
        //ans=(a*b)/gcd(a,b);//(2値a,bの最小公倍数は ab/(aとbの最大公約数) で求められる) <- だけどオーバフローする可能性があるので下の処理で
        int gcd = gcd(a,b);
        int tmp = b/gcd;
        return a*tmp;
    }

    public long leastCommonMultiple(long a,long b)////最小公倍数(long)
    {
        //ans=(a*b)/gcd(a,b);//(2値a,bの最小公倍数は ab/(aとbの最大公約数) で求められる)
        long gcd = gcd(a,b);
        long tmp = b/gcd;
        return a*tmp;
    }

    public boolean isPrime(int n)//素数かどうかを判定する(int)
    {
        if (n==1) return false;//1は素数でない

        for (int i=2;i*i<=n; ++i)//2以上sqrt(n)以下に約数がある時，nは約数とは言えない
        {
            if (n%i == 0) return false;
        }
        return true;
    }

    public boolean isPrime(long n)//素数かどうかを判定する(long)
    {
        if (n==1) return false;//1は素数でない

        for (long i=2;i*i<=n; ++i)//2以上sqrt(n)以下に約数がある時，nは約数とは言えない
        {
            if (n%i == 0) return false;
        }
        return true;
    }

    public Map<Integer,Integer> primeFactors(int n)//素因数分解(int)//key=素数 value=乗数のmapを返す
    {
        Map <Integer,Integer> map = new HashMap<>();

        if (n==1)
        {
            map.put(n,1);
            return map;
        }

        int nn=n;
        for (int i=2;i*i<=n;++i)
        {
            while (n%i ==0)
            {
                if (map.get(i) == null)
                {
                    map.put(i,1);
                    n/=i;
                }else
                {
                    int t=map.get(i)+1;
                    map.put(i,t);
                    n/=i;
                }
            }
        }

        if (n!=1) map.put(n,1);

        return map;
    }

    public Map<Long,Long> primeFactors(long n)//素因数分解(int)//key=素数 value=乗数のmapを返す
    {
        Map <Long,Long> map = new HashMap<>();
        long t1=1;

        if (n==1)
        {
            map.put(n,t1);
            return map;
        }

        long nn=n;
        for (long i=2;i*i<=n;++i)
        {
            while (n%i ==0)
            {
                if (map.get(i) == null)
                {
                    map.put(i,t1);
                    n/=i;
                }else
                {
                    long t=map.get(i)+1;
                    map.put(i,t);
                    n/=i;
                }
            }
        }

        if (n!=1) map.put(n,t1);

        return map;
    }

    //SieveOfEratosthenes
    public int numOfSieveOfEratosthenes(int n)//エラトステネスの篩//このコードでは素数の数を出す//n以下の素数の数
    {
        //ここに入っている値が1なら,indの値は素数
        //なので，素数を列挙したかったら，下の処理が終わった後にvalueが1のindを出せば良い
        int primeList[]=new int[n+1];

        for (int i=0;i<n+1;++i)
        {
            if (i==0 || i==1) primeList[i]=0;//0と1は素数ではない
            else primeList[i] = 1;//とりあえず全部に1をおく
        }

        int count=0;
        for (int i=0;i<n+1;++i)
        {
            if (primeList[i]==1)
            {
                ++count;
                //iが素数判定した値
                for (int j=i+i;j<=n;j+=i)//素数と判定した場合，nまでその数を足し上げていき，その数を素数出ないと判定する
                {
                    primeList[j]=0;
                }
            }
        }
        return count;
    }

    //nの約数を求める（計算量はO(√n)）
    public int countDivisor(int n)
    {
        int count = 0;
        int max = (int)Math.sqrt(n);
        for (int i = 1;i<=max;++i)
        {
            if (n%i == 0)
            {
                count += 2;
            }
        }
        return count;
    }

    public long countDivisor(long n)
    {
        long count = 0;
        long max = (long)Math.sqrt(n);
        for (long i = 1;i<=max;++i)
        {
            if (n%i == 0) count += 2;
        }
        return count;
    }

    public List<Integer> divisors(int n)
    {
        List<Integer> divisorsList = new ArrayList<>();
        int max = (int)Math.sqrt(n);
        for (int i = 1;i<=max;++i)
        {
            if (n%i == 0)
            {
                divisorsList.add(i);
                divisorsList.add(n/i);
            }
        }
        return divisorsList;
    }

    public List<Long> divisors(long n)
    {
        List<Long> divisorsList = new ArrayList<>();
        long max = (long) Math.sqrt(n);
        for (long i = 1;i<=max;++i)
        {
            if (n%i == 0)
            {
                divisorsList.add(i);
                divisorsList.add(n/i);
            }
        }
        return divisorsList;
    }

}