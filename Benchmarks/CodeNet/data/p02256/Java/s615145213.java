import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x,y;
        x = input.nextLong();
        y = input.nextLong();
        long ans;
        ans = GCD(x,y);
        System.out.println(ans);
    }
    public static long GCD(long a, long b){
        long tmp,gcd;
        while (a != 0 && b != 0){
            if (a < b){
                tmp = a;
                a = b;
                b = tmp;
            }
            tmp = a;
            a = b;
            b = tmp%b;
        }
        gcd = Math.max(a,b);
        return gcd;
    }
}
