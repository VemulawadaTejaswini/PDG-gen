import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int prise = 0;

            if (X == 1) {
                prise += 300000;
            } else if (X == 2) {
                prise += 200000;
            } else if (X == 3) {
                prise += 100000;
            }

            if (Y == 1) {
                prise += 300000;
            } else if (Y == 2) {
                prise += 200000;
            } else if (Y == 3) {
                prise += 100000;
            }

            if (X == 1 && Y == 1) {
                prise += 400000;
            }

            System.out.println(prise);
        }
    }

}
