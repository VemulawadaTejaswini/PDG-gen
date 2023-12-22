import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x1;
        if (a % 2 == 0) {
            x1 = a * 25 / 2;
        } else {
            x1 = a * 25 / 2 + 1;
        }
        int x2 = b * 10;
        int result = -1;
        for (int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
            if (i * 2 / 25 == a && i / 10 == b) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}