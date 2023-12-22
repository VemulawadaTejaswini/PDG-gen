import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long n = sc.nextLong();
        int[] m = new int[100];
        Arrays.fill(m, -1);

        for (int i = 1; i < 100; i++) {
            m[i] = (int) (n % 26);
            if (m[i] == 0) m[i] = 26;
            n = (n - m[i]) / 26;
            if (n == 0) {
                break;
            }
        }

        for (int i = 99; i > 0; i--) {
            switch (m[i]) {
                case -1:
                    break;
                case 1:
                    System.out.print("a");
                    break;
                case 2:
                    System.out.print("b");
                    break;
                case 3:
                    System.out.print("c");
                    break;
                case 4:
                    System.out.print("d");
                    break;
                case 5:
                    System.out.print("e");
                    break;
                case 6:
                    System.out.print("f");
                    break;
                case 7:
                    System.out.print("g");
                    break;
                case 8:
                    System.out.print("h");
                    break;
                case 9:
                    System.out.print("i");
                    break;
                case 10:
                    System.out.print("j");
                    break;
                case 11:
                    System.out.print("k");
                    break;
                case 12:
                    System.out.print("l");
                    break;
                case 13:
                    System.out.print("m");
                    break;
                case 14:
                    System.out.print("n");
                    break;
                case 15:
                    System.out.print("o");
                    break;
                case 16:
                    System.out.print("p");
                    break;
                case 17:
                    System.out.print("q");
                    break;
                case 18:
                    System.out.print("r");
                    break;
                case 19:
                    System.out.print("s");
                    break;
                case 20:
                    System.out.print("t");
                    break;
                case 21:
                    System.out.print("u");
                    break;
                case 22:
                    System.out.print("v");
                    break;
                case 23:
                    System.out.print("w");
                    break;
                case 24:
                    System.out.print("x");
                    break;
                case 25:
                    System.out.print("y");
                    break;
                case 0:
                case 26:
                    System.out.print("z");
                    break;
            }
        }
//        switch (m[1]) {
//            case -1:
//            case 0:
//                System.out.print("a");
//                break;
//            case 1:
//                System.out.print("b");
//                break;
//            case 2:
//                System.out.print("c");
//                break;
//            case 3:
//                System.out.print("d");
//                break;
//            case 4:
//                System.out.print("e");
//                break;
//            case 5:
//                System.out.print("f");
//                break;
//            case 6:
//                System.out.print("g");
//                break;
//            case 7:
//                System.out.print("h");
//                break;
//            case 8:
//                System.out.print("i");
//                break;
//            case 9:
//                System.out.print("j");
//                break;
//            case 10:
//                System.out.print("k");
//                break;
//            case 11:
//                System.out.print("l");
//                break;
//            case 12:
//                System.out.print("m");
//                break;
//            case 13:
//                System.out.print("n");
//                break;
//            case 14:
//                System.out.print("o");
//                break;
//            case 15:
//                System.out.print("p");
//                break;
//            case 16:
//                System.out.print("q");
//                break;
//            case 17:
//                System.out.print("r");
//                break;
//            case 18:
//                System.out.print("s");
//                break;
//            case 19:
//                System.out.print("t");
//                break;
//            case 20:
//                System.out.print("u");
//                break;
//            case 21:
//                System.out.print("v");
//                break;
//            case 22:
//                System.out.print("w");
//                break;
//            case 23:
//                System.out.print("x");
//                break;
//            case 24:
//                System.out.print("y");
//                break;
//            case 25:
//                System.out.print("z");
//                break;
//        }
        System.out.println("");
    }
}
