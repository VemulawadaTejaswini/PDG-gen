
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        long N=gl();
        long all=modpow(10, N, 1000000007);
        long nz=modpow(9, N, 1000000007);
        long nr=modpow(8, N, 1000000007);
        long ty = (all -nz -nz + 1000000007 *2 + nr) % 1000000007;
        long ans = (all + 1000000007 - ty) % 1000000007;

        System.out.println(ty);
    }

 // a^nをmodで割ったあまり
    public static long modpow(long a, long n, long mod) {
        long res=1;
        while(n>0) {
            if((n & 1) == 1) res=res*a%mod;
            a=a*a%mod;
            n=n>>1;
        }

        return res;
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}