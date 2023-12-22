import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

//        角度を求める
        double angle = (h * 30.0 + m * 0.5) - ( m * 6.0 );
        double angles = Math.abs(angle);

        double before = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)
                                    - (2.0 * a * b * Math.cos(Math.toRadians(angles))));
        System.out.println(before);

        scanner.close();
    }

}