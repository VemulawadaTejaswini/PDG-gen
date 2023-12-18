import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = nextInt(scanner);
        int m = Math.abs((n % 1000) - 1000);
        if (m == 1000) {
            System.out.println(0);
        }else {
            System.out.println(m);
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



