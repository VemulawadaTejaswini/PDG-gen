import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        while ((x = sc.nextInt()) != 0 && (y = sc.nextInt()) != 0) {
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