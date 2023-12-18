

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int xLength = x2 - x1;
        int yLength = y2 - y1;
        for (int i = 0; i < yLength; ++i) {
            System.out.print("U");
        }
        for (int i = 0; i < xLength; ++i) {
            System.out.print("R");
        }

        for (int i = 0; i < yLength; ++i) {
            System.out.print("D");
        }

        for (int i = 0; i < xLength; ++i) {
            System.out.print("L");
        }
        System.out.print("L");

        for (int i = 0; i < yLength + 1; ++i) {
            System.out.print("U");
        }

        for (int i = 0; i < xLength + 1; ++i) {
            System.out.print("R");
        }
        System.out.print("D");
        System.out.print("R");
        for (int i = 0; i < yLength + 1; ++i) {
            System.out.print("D");
        }
        for (int i = 0; i < xLength + 1; ++i) {
            System.out.print("L");
        }
        System.out.print("U");
    }
}
