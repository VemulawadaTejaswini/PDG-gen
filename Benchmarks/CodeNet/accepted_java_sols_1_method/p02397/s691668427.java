import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int i;

        while (x != 0 || y != 0) {
            if (x > y) {
                i = x;
                x = y;
                y = i;

            }
            System.out.println(x + " " + y);

            x = scan.nextInt();
            y = scan.nextInt();

        }
    }
}
