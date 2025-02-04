import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int m = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
    
            if (m == -1 && f == -1 && r == -1) {
                scanner.close();
                return;
            }

            if (m == -1 || f == -1) {
                System.out.println("F");
            } else if (m + f >= 80) {
                System.out.println("A");
            } else if (m + f >= 65 && m + f < 80) {
                System.out.println("B");
            } else if (m + f >= 50 && m + f < 65) {
                System.out.println("C");
            } else if (m + f >= 30 && m + f < 50) {
                if (r >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
        }
    }
}

