import java.util.Scanner;

public class Main {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] xys = input.split(" ");
        int x1 = Integer.parseInt(xys[0]);
        int y1 = Integer.parseInt(xys[1]);
        int x2 = Integer.parseInt(xys[2]);
        int y2 = Integer.parseInt(xys[3]);

        int l1 = x2 - x1;
        int l2 = y2 - y1;

        int x3 = x2 - l2;
        int y3 = y2 + l1;
        int x4 = x3 - l1;
        int y4 = y3 - l2;

        System.out.print(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
