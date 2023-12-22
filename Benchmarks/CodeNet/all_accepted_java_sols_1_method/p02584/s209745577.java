import java.util.*;

public class Main {

    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        x = Math.abs(x);

        long ret = 0;

        long r = x/d;
        if(k<=r){
            ret = x-d*k;
            System.out.println(ret);
            return;
        }else{
            k-=r;
            x-=d*r;
        }

        if(k%2!=0) ret = -(x - d);
        else ret = x;

        System.out.println(ret);

        sc.close();
    }


}