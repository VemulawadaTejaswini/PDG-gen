import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int ans = 1;
        while (true) {
            int a = (int) Math.pow(count, 2);
            if (a <= n) {
                ans = a;
                count++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}