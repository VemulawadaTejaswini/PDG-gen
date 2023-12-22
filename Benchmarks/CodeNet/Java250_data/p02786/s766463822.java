import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(run());
    }

    private static ArrayList<Integer> nScan(Scanner sc, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    private static Object run() {
        try (Scanner sc = new Scanner(System.in);) {
            long h = sc.nextLong(), result = 0;
            for (long i = 1; h != 0; i *= 2) {
                result += i;
                h = (long) Math.floor(h / 2);
            }
            return result;
        }
    }
}