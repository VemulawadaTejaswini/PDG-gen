import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0) break;

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

    }
}