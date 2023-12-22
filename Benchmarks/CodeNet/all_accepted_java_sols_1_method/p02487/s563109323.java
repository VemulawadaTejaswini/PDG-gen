import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0) break;

            for (int x = 0; x < w; x++) System.out.print("#");
            System.out.print("\n");
            for (int y = 1; y < h-1; y++) {
                System.out.print("#"); 
                for (int x = 1; x < w-1; x++) {
                    System.out.print(".");
                }
                System.out.print("#\n");
            }

            for (int x = 0; x < w; x++) System.out.print("#");
            System.out.print("\n\n");
        }

    }
}