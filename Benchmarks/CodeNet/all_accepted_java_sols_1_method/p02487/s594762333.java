import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int h = scan.nextInt();
            int w = scan.nextInt();

            if (h == 0 && w == 0) {
                break;
            }
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (x == 0 || x == w-1 || y == 0 || y == h-1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}