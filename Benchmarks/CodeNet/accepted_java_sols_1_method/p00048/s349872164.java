import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] w = { 48.0, 51.0, 54.0, 57.0, 60.0, 64.0, 69.0, 75.0, 81.0, 91.0 };
        String[] c = { "light fly", "fly", "bantam", "feather", "light", "light welter", "welter", "light middle",
                "middle", "light heavy", "heavy" };
        while (sc.hasNext()) {
            double weight = sc.nextDouble();
            for (int i = 0; i < w.length; i++) {
                if (w[i] >= weight) {
                    System.out.println(c[i]);
                    break;
                }
            }
            if (weight > 91.0) {
                System.out.println(c[c.length - 1]);
            }
        }
    }
}
