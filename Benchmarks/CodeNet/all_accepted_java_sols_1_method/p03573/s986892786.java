import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if (a == b) {
            ans = c;
        } else if (b == c) {
            ans = a;
        } else if (a == c) {
            ans = b;
        }
        System.out.println(ans);
    }
}