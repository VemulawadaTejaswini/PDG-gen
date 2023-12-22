import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int ans = 0;
        long tmp = 100;
        do {
            tmp = (long)Math.floor(tmp * 1.01);
            ans++;
        } while(tmp < x);
        System.out.println(ans);
    }
}
