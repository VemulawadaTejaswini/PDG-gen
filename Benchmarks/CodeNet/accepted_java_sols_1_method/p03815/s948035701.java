import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = x / 11l * 2l;
        long mod = x % 11;
        if(mod > 6) {
            ans += 2;
        } else if(mod > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}