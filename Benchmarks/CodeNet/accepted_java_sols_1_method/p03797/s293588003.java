import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0;
        if(m / 2 >= n){
            ans = n;
        }else {
            ans = m / 2;
        }
        m -= ans * 2;
        ans += m / 4;
        System.out.println(ans);
    }
}