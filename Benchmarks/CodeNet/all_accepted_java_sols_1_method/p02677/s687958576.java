import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double aKakudo = (H + (M / 60.0)) * 30;
        double bKakudo = M * 6;

        double kakudo = Math.abs(aKakudo - bKakudo);
        if (kakudo > 180) {
            kakudo = 360 - kakudo;
        }

//        System.out.println("kakudo=" + kakudo);

        double cosC = Math.cos(Math.toRadians(kakudo));
//        System.out.println("cosC=" + cosC);

        double cc = a * a + b * b - 2 * a * b * cosC;
//        System.out.println("cc=" + cc);

        double c = Math.sqrt(cc);
        System.out.println(c);

    }
}
