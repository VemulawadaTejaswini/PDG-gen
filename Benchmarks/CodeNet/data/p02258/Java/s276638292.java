import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int max;
        int min;

        int r0 = Integer.parseInt(scanner.next());
        int r1 = Integer.parseInt(scanner.next());
        max = r1 - r0;
        min = Math.min(r1, r0);

        for (int i = 2; i < n; i++) {
            int ri = Integer.parseInt(scanner.next());
            if (ri - min > max) {
                max = ri - min;
            }
            min = Math.min(ri, min);
        }

        System.out.println(max);
    }
}