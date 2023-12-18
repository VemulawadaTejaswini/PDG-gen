import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lMax = 1;
        int rMin = n;

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            lMax = lMax < l ? l : lMax;
            rMin = rMin > r ? r : rMin;
        }
        int answer = rMin - lMax >= 0 ? rMin - lMax + 1 : 0;
        System.out.println(answer);
    }
}
