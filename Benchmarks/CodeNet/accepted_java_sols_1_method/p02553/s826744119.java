import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            long[] ary = {a * c, a * d, b * c, b * d};
            long max = ary[0];

            for (int i = 1; i < ary.length; i++) {
                if (ary[i] > max) {
                    max = ary[i];
                }
            }
            
            System.out.println(max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}