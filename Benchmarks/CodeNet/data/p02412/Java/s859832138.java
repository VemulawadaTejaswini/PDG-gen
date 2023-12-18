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
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n == 0 && x == 0) {
                scanner.close();
                return;
            }

            int count = 0;
            for (int a = 1; a <= n; a++) {
                for (int b = a + 1; b <= n; b++) {
                    for (int c = b + 1; c <= n; c++) {
                        if (a + b + c == x) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}

