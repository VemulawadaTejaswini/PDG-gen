import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();

        long year = 0;
        double y = 100.0;
        while (y < x && y > 0) {
            y = Math.floor(y * 1.01);
            year++;
        }

        System.out.println(year);
    }
}