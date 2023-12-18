import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int r = 0;
        if (400 <= x && x <= 599) r = 8;
        if (600 <= x && x <= 799) r = 7;
        if (800 <= x && x <= 999) r = 6;
        if (1000 <= x && x <= 1199) r = 5;
        if (1200 <= x && x <= 1399) r = 4;
        if (1400 <= x && x <= 1599) r = 3;
        if (1600 <= x && x <= 1799) r = 2;
        if (1800 <= x && x <= 1999) r = 1;
        System.out.println(r);
        scanner.close();
    }
}