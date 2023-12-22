

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int X = sc.nextInt(), t = sc.nextInt();
            System.out.println(Math.max(0, X - t));
        }
    }
}
