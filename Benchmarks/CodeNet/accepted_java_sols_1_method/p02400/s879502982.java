import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();

        double sq = r * r * 3.141592653589;
        double ci = r * 2 * 3.141592653589;

        System.out.println(String.format("%.6f", sq) + " " + String.format("%.6f", ci));

    }
}

