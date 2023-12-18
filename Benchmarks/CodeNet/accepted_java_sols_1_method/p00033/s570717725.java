import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));

        int n ;
        while(cin.hasNext())
        {
            n = cin.nextInt();
            int a[] = new int[10];

            while(n>0)
            {
                for(int i=0; i<10; ++i)
                {
                    a[i] = cin.nextInt();
                }
                int l, r;
                l = r =0;
                boolean ans = true;
                for(int i=0; i<10; ++i)
                {
                    if(a[i] > l)
                    {
                        l = a[i];
                    }else if(a[i] > r)
                    {
                        r = a[i];
                    }else {
                        ans = false;
                        break;
                    }
                }
                System.out.format("%s\n", ans?"YES":"NO");
                n--;
            }
        }

    }
}

