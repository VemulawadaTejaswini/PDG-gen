import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());
        int ans = 0;
        while (x <= y) {
            x *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}