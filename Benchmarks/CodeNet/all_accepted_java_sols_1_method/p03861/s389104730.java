import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long ans = 0;
        long low = (a/c)*c;
        long hi = (b/c)*c;
        ans += (hi-low)/c;
        if(low==a) ans++;
        System.out.println(ans);
    }
}
