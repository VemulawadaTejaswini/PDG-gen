import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int x = x2 - x1;
        int y = y2 - y1;
        System.out.println((x2 - y) + " " + (y2 + x) + " " + (x1 - y) + " " + (y1 + x));
    }
}
