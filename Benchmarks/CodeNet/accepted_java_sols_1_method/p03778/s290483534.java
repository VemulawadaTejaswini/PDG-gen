import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r;
        if (a < b) {
            r = b - (a + w);
        } else {
            r = a - (b + w);
        }
        System.out.println(r < 0 ? 0 : r);
    }
}