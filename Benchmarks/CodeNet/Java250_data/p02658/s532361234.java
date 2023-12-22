import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        long[] a = new long[n];
        long p = 1;
        boolean isZero = false;
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scanner.next());
            if (a[i] == 0) {
                isZero = true;
            }
        }
        if (isZero) {
            System.out.println(0);
            return;
        }
        try {
            for (int i = 0; i < n; i++) {
                p = Math.multiplyExact(p, a[i]);
            }
        }catch (Exception e) {
            System.out.println(-1);
            return;
        }
        if (p > 1000000000000000000L) {
            System.out.println(-1);
            return;
        }
        System.out.println(p);


    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

}



