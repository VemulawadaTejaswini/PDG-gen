import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        int ans = 0;
        int times = 0 ;
        times = (int) Math.ceil((double) N / X);

        ans = times * T;

        System.out.println(ans);

    }
}