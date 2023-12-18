import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }

    static final int MAXN = 1000001;
    static Set<Integer> factors;

    // stores smallest prime factor for every number
    static int[] spf = new int[MAXN];

    // Calculating SPF (Smallest Prime Factor) for every
    // number till MAXN.
    // Time Complexity : O(nloglogn)
    static void sieve(){
        spf[1] = 1;
        for (int i=2; i<MAXN; i++)

            // marking smallest prime factor for every
            // number to be itself.
            spf[i] = i;

        // separately marking spf for every even
        // number as 2
        for (int i=4; i<MAXN; i+=2)
            spf[i] = 2;

        for (int i=3; i*i<MAXN; i++) {
            // checking if i is prime
            if (spf[i] == i)
            {
                // marking SPF for all numbers divisible by i
                for (int j=i*i; j<MAXN; j+=i)

                    // marking spf[j] if it is not
                    // previously marked
                    if (spf[j]==j)
                        spf[j] = i;
            }
        }
    }

    // A O(log n) function returning primefactorization
    // by dividing by smallest prime factor at every step
    static boolean getFactorization(int x) {
        Set<Integer> temp = new HashSet<>();
        int copy = x;
        while (x != 1) {
            int f = spf[x];
            if(factors.contains(f) && !temp.contains(f)) {
                //System.out.println("For "+copy+" was common : "+f);
                return false;
            }
            factors.add(f);
            temp.add(f);
            x = x / spf[x];
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        boolean[] res = new boolean[n];
        factors = new HashSet<>();
        sieve();

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int currGCD = a[n-1];
        boolean flag = true;
        getFactorization(a[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            currGCD = gcd(a[i], currGCD);
            if(!getFactorization(a[i]))
                flag = false;
        }
        if(flag){
            System.out.println("pairwise coprime");
        }else if(currGCD == 1){
            System.out.println("setwise coprime");
        }else{
            System.out.println("not coprime");
        }
    }
}
