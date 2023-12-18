import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        final int MAX = 300000;
        Scanner sc = new Scanner(System.in);
        boolean[] msprime = new boolean[MAX + 1];
        int limit = MAX / 7;
        for (int i = 0; i <= limit; i++) {
            if ((7 * i + 1) > MAX)
                break;
            msprime[7 * i + 1] = true;
            if ((7 * i + 6) > MAX)
                break;
            msprime[7 * i + 6] = true;
        }
        msprime[1] = false;

        for (int i = 0; i < MAX + 1; i++) {
            if (msprime[i]) {
                if(i*6>MAX)continue;
                msprime[i * 6] = false;
                for (int j = 1; j <= limit; j++) {
                    if (i * (7 * j + 1) > MAX)
                        break;
                    msprime[i * (7 * j + 1)] = false;
                    if (i * (7 * j + 6) > MAX)
                        break;
                    msprime[i * (7 * j + 6)] = false;
                }
            }
        }
       // System.out.println(Arrays.toString(msprime));
        while (true) {
            int n = sc.nextInt();
            if (n == 1)
                break;
            System.out.print(n + ":");
            if(6>n)continue;
            if (n % 6 == 0)
                System.out.print(" 6");
            for (int i = 1; i<= n; i++) {
                if((7*i+1)>n)break;
                if (msprime[7 * i + 1] && n % (7 * i + 1) == 0)
                    System.out.print(" " + (7 * i + 1));
                if((7*i+6)>n)break;
                if (msprime[7 * i + 6] && n % (7 * i + 6) == 0)
                    System.out.print(" " + (7 * i + 6));
            }
            System.out.println();
        }
    }
}