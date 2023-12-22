import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int hei [] = new int[10];
        for (int i = 0; i < 10; i++) {
            hei[i] = scanner.nextInt();
        }

        Arrays.sort(hei);
        for (int i = 0; i < 3; i++) {
            System.out.println(hei[9 - i]);
        }
    }
}

