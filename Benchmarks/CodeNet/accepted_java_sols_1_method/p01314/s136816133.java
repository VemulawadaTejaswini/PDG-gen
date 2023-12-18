import java.util.*;

public class Main {
    private static final int MAX = 1000;
    
    public static void main(String[] args) {
        int[] ans = new int[-~MAX];
        
        int base = 1;
        for(int i = 2; i <= MAX / 2; i++) {
            for(int now = base + i; now <= MAX; now += i) {
                ans[now]++;
            }
            base += i;
        }

        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                System.out.println(ans[n]);
            }
        }
    }
}