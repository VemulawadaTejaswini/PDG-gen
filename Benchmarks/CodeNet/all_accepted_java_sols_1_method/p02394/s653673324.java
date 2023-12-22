
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int W = sc.nextInt();
    static int H = sc.nextInt();
    static int x = sc.nextInt();
    static int y = sc.nextInt();
    static int r = sc.nextInt();

    public static void main(String[] args) {
        if (W < x + r || H < y + r || x - r < 0 || y - r < 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }

}

