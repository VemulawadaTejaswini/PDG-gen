import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    static int count[];
    static boolean flag[];
    static int num ; //order

    static {

        final int n = 1000000;
        count = new int[n];
        flag = new boolean[n];
        num = 0;

        sievePrime(n);
    }
    //是否是素数
    static boolean primeFlag(int n)
    {
        double temp = Math.sqrt(n);
        for(int i=2; i <= temp ; ++i )
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    // 素数个数  逐个计数
    static void sievePrime(int n)
    {
        for(int i =2; i<=n; ++i)
        {
            if(primeFlag(i))
            {
                flag[i] = true;
            }
        }
        count[1] = 0;
        for(int j =2 ; j<n; ++j)
        {
            if(flag[j])
            {
                count[j] = count[j-1] + 1;
            }else{
                count[j] = count[j-1];
            }

        }
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int a;
        while(cin.hasNext())
        {
            a = cin.nextInt();

            System.out.println(count[a]);
        }
    }


}

