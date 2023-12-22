import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int tu = 0; tu <= x; tu++) {
            for (int ka = 0; ka <= x - tu; ka++) {
                if (y == tu*2 + ka*4 && x == tu + ka) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
