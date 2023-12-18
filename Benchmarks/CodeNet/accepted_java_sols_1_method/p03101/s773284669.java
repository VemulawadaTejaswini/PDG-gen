

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int h1 = scanner.nextInt();
        int w1 = scanner.nextInt();
        int remain = (h - h1) * (w - w1);
        System.out.println(remain);
    }
}
