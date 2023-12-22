import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long base = 26L;
        long max = 26L;
        int d = 1;
        Map<Integer, Long> mmap = new HashMap<>();
        mmap.put(d, max);
        mmap.put(0, 0L);
        while(max < n){
            base *= 26L;
            max += base;
            d++;
            mmap.put(d, max);
        }
        String ans = "";
        for (int i = d-1; i >= 0; i--) {
            base /= 26L;
            int a = (int)((n - mmap.get(i) -1) / base);
            char c = (char)((int)'a' + a);
            ans += c;
            n -= base * (a+1);
        }
        System.out.println(ans);
        sc.close();

    }

}
