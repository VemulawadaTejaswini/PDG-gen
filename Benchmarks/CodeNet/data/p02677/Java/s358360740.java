
import java.util.*;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a = nextInt();
        int b = nextInt();
        int h = nextInt();
        int m = nextInt();
        double hDegree = (h * 60 + m) *360/(12.0*60.0);
        double minDegree = m * (360 / 60.0);
        if (hDegree ==  minDegree) System.out.println(Math.abs(a - b));
        else {
            double hRad = Math.toRadians(hDegree);
            double hX = Math.cos(hRad) * a;
            double hY = Math.sin(hRad) * a;
            double mRad = Math.toRadians(minDegree);
            double minX = Math.cos(mRad) * b;
            double minY = Math.sin(mRad) * b;
            double r = distance(hX,hY,minX,minY);
            System.out.println(r);
        }
    }

    public static int nextInt() {
        return Integer.parseInt(scanner.next());
    }

    public static long nextLong() {
        return Long.parseLong(scanner.next());
    }

    public static double nextDouble() {
        return Double.parseDouble(scanner.next());
    }

    public static short nextShort() {
        return Short.parseShort(scanner.next());
    }

    public static float nextFloat() {
        return Float.parseFloat(scanner.next());
    }

    public static void printYes() {
        System.out.println("Yes");
    }

    public static void printYES() {
        System.out.println("YES");
    }

    public static void printNo() {
        System.out.println("No");
    }

    public static void printNO() {
        System.out.println("NO");
    }

    public static void nextLine() {
        scanner.nextLine();
    }

    public static double distance(double x, double y, double x2, double y2) {
        return Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
    }
}