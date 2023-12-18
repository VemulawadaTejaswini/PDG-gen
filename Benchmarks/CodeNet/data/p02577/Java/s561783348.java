import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.next().split("");
        long sum = 0;
        for (String str : n) {
            sum += Integer.parseInt(str);
        }
        if (sum % 9 == 0) {
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







