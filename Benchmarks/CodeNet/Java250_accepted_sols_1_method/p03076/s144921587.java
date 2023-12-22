import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) n[i] = sc.nextInt();
        int ans = 0, last = 10;
        for (int ni: n) {
            ans += Math.ceil(ni/10.0) * 10;
            if (ni % 10 != 0) last = Math.min(last, ni%10);
        }
        if (last != 10) ans -= 10 - last;
        System.out.println(ans);
    }
}
