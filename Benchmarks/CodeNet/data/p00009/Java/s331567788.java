import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeLib = new ArrayList<>();
        primeLib.add(2);
        // for (int i = 1; i < 100; i++) {
        //     System.out.println(i + (isPrime(i) ? "T" : "F"));
        // }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(primeCountFor(n));
        }
    }

    public static ArrayList<Integer> primeLib;
    public static int checkedMax = 0;

    public static int primeCountFor(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int c = 1;
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                c++;
            }
        }
        return c;
    }

    public static boolean isPrime(int n) {
        if (n <= checkedMax) {
            return primeLib.contains(n);
        }
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int l = (int) Math.sqrt(n);
        for (int i = 3; i <= l; i += 2) {
            if (n % i == 0) {
                checkedMax = Math.max(checkedMax, n);
                return false;
            }
        }
        primeLib.add(n);
        return true;

    }
}