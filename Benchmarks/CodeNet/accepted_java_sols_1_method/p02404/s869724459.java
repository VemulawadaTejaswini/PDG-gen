import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                sc.close();
                return;
            }
            for (int i = 0; i < w; i++) {
                System.out.print("#");
            }
            System.out.println();
            for (int i = 1; i < h - 1; i++) {
                for (int j = 0; j < w; j++) {
                    if (j == 0 || j == w - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < w; i++) {
                System.out.print("#");
            }
            System.out.println();
            System.out.println();
        }
    }
}
