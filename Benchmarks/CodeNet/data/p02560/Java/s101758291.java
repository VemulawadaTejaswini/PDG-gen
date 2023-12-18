import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class MathLib{
    public static long floor_sum(long n, long m, long a, long b){
        long ans = 0;
        if(a >= m){
            ans += (n-1) * n * (a/m) / 2;
            a %= m;
        }
        if(b >= m){
            ans += n * (b/m);
            b %= m;
        }

        long y_max = (a*n+b) / m;
        long x_max = y_max * m - b;
        if(y_max == 0) return ans;
        ans += (n - (x_max+a-1)/a) * y_max;
        ans += floor_sum(y_max, a, m, (a-x_max%a)%a);
        return ans;
    }
}

public class Main {
    public static long digit(long ans, int i){
		if (ans<i) return ans;
		else return (ans%i)+digit(ans/i,i);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            long N = sc.nextLong();
            long M = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();
            System.out.println(MathLib.floor_sum(N, M, A, B));
        }
    }
}