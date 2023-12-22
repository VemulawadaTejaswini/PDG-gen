import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        double area = (long) w * (long) h / 2.0;
        int root = (w / 2.0 == (double) x && h / 2.0 == (double) y) ? 1 : 0;

        System.out.println(area + " " + root);
    }
}
