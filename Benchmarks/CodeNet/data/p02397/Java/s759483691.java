import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0)
                break;
            if (x < y) {
                System.out.print(x);
                System.out.print(' ');
                System.out.println(y);
            } else {
                System.out.print(y);
                System.out.print(' ');
                System.out.println(x);
            }
        }
    }
}