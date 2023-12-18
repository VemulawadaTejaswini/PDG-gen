/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int[] prime=Generate_prime(1299709);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int d = Arrays.binarySearch(prime, n);
            if (n == 1 || d > 0) {
                out.println(0);
            } else {
                d = ~d;
                out.println(prime[d] - prime[d - 1]);
            }
        }
    }
    static int[] Generate_prime(int n) {
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        for (int i = 6; i <= n; i += 6) {
            int p1 = i - 1, p2 = i + 1;
            if (isPrime(p1)) prime.add(p1);
            if (isPrime(p2)) prime.add(p2);
        }
        int t=prime.size();
        int[] Generated_prime=new int[t+1];
        //Iteratorでもよい
        for (int i=1;i<=t;i++){
            Generated_prime[i]=prime.get(i-1);
        }
        return Generated_prime;
    }
    static boolean isPrime(int p){
        if(p==1)return false;
        int t= (int) (sqrt(p)+1);
        boolean f=true;
        for (int i = 5; i <= t && f; i++) if(p%i==0) f=false;
        return f;
    }
}
