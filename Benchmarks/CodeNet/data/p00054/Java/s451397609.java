import java.util.*;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, b, n;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        if(!sc.hasNext())return false;
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        return true;
    }

    static void solve(){
        String f = new BigDecimal((double) a/b).setScale(11, BigDecimal.ROUND_HALF_UP).toString();
        int s = 0;
        for(int i = 2; i < n+2; i++){
            s += f.charAt(i) - '0';
        }
        System.out.println(s);
    }

}