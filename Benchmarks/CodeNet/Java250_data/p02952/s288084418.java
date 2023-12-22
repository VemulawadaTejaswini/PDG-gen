import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        System.out.println(UnevenNumbers(N));
    }
    public static int UnevenNumbers(int N) {
        int ans = 0;
        if (10 <= N) {
            ans += 9;   // 1 - 9
        } else {
            return N;
        }
        if (N < 100) {
            return ans;
        }
        
        if (1000 <= N) {
            ans += 900; // 100 - 999
        } else {
            return ans + (N - 99);
        }
        if (N < 10000) {
            return ans;
        }
        if (99999 < N) {
            N = 99999;
        }
        return ans + (N - 9999);
    }
}
