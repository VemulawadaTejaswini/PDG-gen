import java.util.Scanner;
public class Main{
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        if(a < b){
            long tmp = a;
            a = b;
            b = tmp;
        }
        return a * b / gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ;i++)
            a[i] = sc.nextLong();
        long ans = a[0];
        for(int i = 1 ; i < n ; i++)
            ans = lcm(ans,a[i]);
        System.out.println(ans);
    }
}
