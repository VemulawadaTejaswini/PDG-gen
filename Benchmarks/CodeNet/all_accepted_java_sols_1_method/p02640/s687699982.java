import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if ((y%2 != 0)) {
            System.out.println("No");
            return;
        }

        int diff = y - (x * 2);
        if( diff < 0 ) {
            System.out.println("No");
            return;
        }

        if ((diff / 2) > x) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}