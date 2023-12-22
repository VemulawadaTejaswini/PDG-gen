import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if (b < 10) {
            c = 10 * a + b;
        } else if (b < 100) {
            c = 100 * a + b;
        } else {
            c = 1000 * a + b;
        }
        boolean flag = false;
        int target = 1;
        for (int i = 1; target <= c; i++) {
            target = (int) Math.pow(i, 2);
            if (target == c) {
                flag = true;
            }
        }
        System.out.println(flag ? "Yes" : "No");

    }
}