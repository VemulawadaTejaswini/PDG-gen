import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i < 7; i++) {
            int pow = (int) Math.pow(2, i);
            if (N == pow) {
                int ans = (int) Math.pow(2, i);
                System.out.println(ans);
                return;
            } else if (N < pow) {
                int ans = (int) Math.pow(2, i - 1);
                System.out.println(ans);
                return;
            }
        }

        System.out.println(64);
    }
}