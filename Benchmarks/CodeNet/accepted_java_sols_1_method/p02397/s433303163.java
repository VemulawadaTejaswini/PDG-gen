import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        while (sc.hasNext()) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                return;
            }
            if (x < y) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
        }

        sc.close();
    }

}

