import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        while (N > 0) {
            ans++;
            N /= K;
        }
        System.out.println(ans);
    }
}

