import java.util.Scanner;

public class Main {
    public static final int F = 0, A = 1, B = 2, C = 3, D = 4;

    public int grade(int m, int f, int r) {
        int sum = m + f;
        if (m == -1 || f == -1) {
            return Main.F;
        } else if (sum >= 80) {
            return Main.A;
        } else if (sum >= 65) {
            return Main.B;
        } else if (sum >= 50) {
            return Main.C;
        } else if (sum >= 30) {
            if (r >= 50) {
                return Main.C;
            } else {
                return Main.D;
            }
        } else {
            return Main.F;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();

        while (true) {
            int inM, inF, inR;
            int result;
            inM = Integer.parseInt(scan.next());
            inF = Integer.parseInt(scan.next());
            inR = Integer.parseInt(scan.next());

            if (inM == -1 && inF == -1 && inR == -1) {
                break;
            }

            result = app.grade(inM, inF, inR);
            switch (result) {
                case Main.F:
                    System.out.println("F");
                    break;
                case Main.A:
                    System.out.println("A");
                    break;
                case Main.B:
                    System.out.println("B");
                    break;
                case Main.C:
                    System.out.println("C");
                    break;
                case Main.D:
                    System.out.println("D");
                    break;
            }
        }

    }
}

