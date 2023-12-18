import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int x = nextInt(scanner);
        int t = nextInt(scanner);
        int div = n / x;
        int mod = n % x;
        if (mod != 0) {
            div++;
        }
        System.out.println(div *t);
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







