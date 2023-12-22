import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        long ans = 0;
        ans += (x / 500) * 1000;
        x -= (x / 500) * 500;
        ans += (x / 5) * 5;

        System.out.println(ans);
    }
}