import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s = scanner.nextInt();

        int duration = 60 - m1 + (h2 - h1 - 1) * 60 + m2;
        int out = (duration - s) > 0 ? duration - s : 0;
        System.out.println(out);
    }
}
