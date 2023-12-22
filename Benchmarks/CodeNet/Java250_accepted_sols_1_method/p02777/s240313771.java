import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color1 = sc.next();
        sc.next();
        int color1Cnt = sc.nextInt();
        int color2Cnt = sc.nextInt();
        String disposed = sc.next();

        if (disposed.equals(color1)) {
            System.out.printf("%d %d", color1Cnt - 1, color2Cnt);
            return;
        }
        System.out.printf("%d %d", color1Cnt, color2Cnt - 1);
    }
}