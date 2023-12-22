import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int x = inp.nextInt();
        int y = inp.nextInt();
        if (n <= k) {
            System.out.println(n * x);
            return;
        }
        int ks = n - k;
        int ans = k * x + ks * y;
        System.out.println(ans);
    }
}