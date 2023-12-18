import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long ans = 0;
        long c = 1;
        while (c*c <= N) {
            if (N%c == 0) {
                if (c-1 > 0 && N/(c-1) == N%(c-1)) {
                    ans += c-1;
                }
                long d = N/c;
                if (d-1 > 0 && N/(d-1) == N%(d-1)) {
                    ans += d-1;
                }
            }
            c++;
        }

        System.out.println(ans);
    }
}

