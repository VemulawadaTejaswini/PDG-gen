import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long base = 26L;
        long max = 26L;
        long d = 1;
        while(max < n){
            base *= 26L;
            max += base;
            d++;
        }
        String ans = "";
        for (int i = 0; i < d; i++) {
            base /= 26;
            int a = (int)(n/base)-1;
            char c = (char)((int)'a' + a);
            ans += c;
            n -= base * (a+1);
        }
        System.out.println(ans);
        sc.close();

    }

}
