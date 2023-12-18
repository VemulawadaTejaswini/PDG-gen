import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double xa1 = sc.nextDouble();
            double ya1 = sc.nextDouble();
            double xa2 = sc.nextDouble();
            double ya2 = sc.nextDouble();
            double xb1 = sc.nextDouble();
            double yb1 = sc.nextDouble();
            double xb2 = sc.nextDouble();
            double yb2 = sc.nextDouble();
            System.out .println(xb1 > xa2 ||
                                yb1 > ya2 ||
                                xb2 < xa1 || yb2 < ya1 ? "NO"
                                                       : "YES");
        }
    }
}