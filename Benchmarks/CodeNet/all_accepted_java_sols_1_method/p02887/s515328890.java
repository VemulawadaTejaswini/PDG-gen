import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        char current = '.';
        long sum = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != current) {
                sum++;
                current = c;
            }
        }

        System.out.println(sum);
    }
}