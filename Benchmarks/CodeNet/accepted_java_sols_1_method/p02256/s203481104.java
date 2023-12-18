import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int mod;
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        while (0 < y) {
            mod = x % y;
            x = y;
            y = mod;
        }
        System.out.println(x);
    }
}
