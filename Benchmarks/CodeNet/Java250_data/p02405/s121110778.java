import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0) break;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    boolean oddRow = (i % 2) == 1;
                    boolean oddColumn = (j % 2) == 1;

                    if ((oddRow && oddColumn) || (!oddRow && !oddColumn)) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }

                }
                System.out.println("");
            }
            System.out.println("");
        }

        sc.close();
    }
}
