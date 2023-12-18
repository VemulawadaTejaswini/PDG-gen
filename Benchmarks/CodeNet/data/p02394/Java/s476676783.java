import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITP1_2_D(args);
    }
    public static void ITP1_2_D(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if (x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
