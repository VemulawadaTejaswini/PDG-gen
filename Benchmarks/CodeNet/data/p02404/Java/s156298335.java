import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0) {
                break;
            }
            write(h, w);
        }

    }

    static void write(int h, int w) {
        // 3 <= h, w
        for (int j = 1; j <= w; j++) {
            System.out.print("#");
            
        }
        System.out.println("");
        for (int i = 2; i <= h - 1; i++) {
            System.out.print("#");
            for (int j = 2; j <= w - 1; j++) {
                System.out.print(".");
            }
            System.out.println("#");
        }
        for (int j = 1; j <= w; j++) {
            System.out.print("#");
        }
        System.out.printf("%n%n");
        /*
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || j == 1 || i == h || j == w) {
                    System.out.print("#");;
                } else {
                    System.out.print(".");;
                }
                if (j == w) {
                    System.out.println("");;
                    if (i == h) {
                        System.out.println("");;
                    }
                }
            }
        }
        */

    }

}
