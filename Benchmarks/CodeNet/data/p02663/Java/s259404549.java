import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        int h = h2 - h1;
        int m = (h * 60 + m2) - m1;
        int ret = m - k;
        System.out.printf(String.valueOf(ret));
    }
}
