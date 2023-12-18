import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }


        long l = 1;
        long r = 1000000000;
        while(r-l>1) {
            long mid = (l+r)/2;
            long num = 0;
            for(int i=0; i<n; i++) {
                long div = a[i]/mid;
                long rem = a[i]%mid;
                long add = 0;
                if(rem == 0) {
                    add = div-1;
                } else {
                    add += div;
                }
                num += add;
            }
            if(num <= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(r);

    }
}