import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        double angleMinute = ((double)m) * 6;
        double angleHours = (((double)h) * 60 + m) / 2;
        double diff = Math.abs(angleHours - angleMinute);
        diff = diff > 180 ? 360 - diff : diff;

        double result = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(diff * (Math.PI / 180)));

        System.out.println(String.format("%.16f", result));
    }

}