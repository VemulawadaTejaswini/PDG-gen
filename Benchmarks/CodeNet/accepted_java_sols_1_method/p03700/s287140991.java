

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long h[] = new long[n];
        for(int i = 0; i < n; i++)
        {
            h[i] = scanner.nextLong();
        }

        long l = 0;
        long r = (long)(1e9 + 1);
        while(l < r - 1)
        {
            long m = (l + r) / 2;
            long temp[] = new long[n];
            for(int i = 0; i < n; i++)
            {
                temp[i] = h[i];
            }
            for(int i = 0; i < n; i++){
                temp[i] -= b * m;
            }
            long x = 0;
            for(int i = 0; i < n; i++){
                if(temp[i] > 0){
                    if(temp[i] % (a - b) == 0)
                    {
                        x += temp[i] / (a - b);
                    }else{
                        x += (temp[i] / (a - b)) + 1;
                    }
                }
            }
            if (x > m) {
                l = m;
            }else{
                r = m;
            }
        }
        System.out.println(r);
    }
}
