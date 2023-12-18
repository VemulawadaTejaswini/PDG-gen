import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        for (String s : scan.nextLine().split(" ")) {
            int i = Integer.parseInt(s);
            if (i < 0 && i > 10000) {
                System.exit(0);
            }
        }

        if (a < b && a < c) {
            if (b < c) {
                print(a, b, c);
            } else {
                print(a, c, b);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                print(b, a, c);
            } else {
                print(a, b, c);
            }
        } else {
            print(c, b, a);
        }

        scan.close();
    }

    public static void print(int one, int tow, int three) {
        System.out.printf("%d %d %d", one, tow, three);
    }

}

