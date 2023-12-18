import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diff1 = Math.abs(a - b);
            int diff2 = Math.abs(b - c);
            int diff3 = Math.abs(c - a);
            int max = Math.max(Math.max(diff1, diff2), diff3);
            int ans = diff1 + diff2 + diff3 - max;
            System.out.println(ans);

        }
    }

}
