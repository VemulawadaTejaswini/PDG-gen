import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h == 1 || w == 1) {
            System.out.println(1);
            return;
        }
        long ans = 0;
        if (h % 2 == 0 || w % 2 == 0) {
            ans = (long) h * w / 2;
        } else {
            ans = (long) h * w / 2 + 1;
        }

        System.out.println(ans);
    }

}
