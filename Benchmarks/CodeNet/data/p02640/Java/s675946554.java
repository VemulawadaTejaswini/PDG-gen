import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = nextDouble(scanner);
        double y = nextDouble(scanner);
        double a = ((4 * x) - y) / 2;
        double b = ((y - (2 * x)) / 2);
        if (b == Math.floor(b)  && b >= 0 && a >= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}



