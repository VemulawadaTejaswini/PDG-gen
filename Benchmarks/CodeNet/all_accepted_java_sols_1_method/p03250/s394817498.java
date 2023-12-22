import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int max = Math.max(a, Math.max(b, c));
        int middle = 0;
        int min = Math.min(a, Math.min(b, c));
        if (max == a) {
            middle = Math.max(b, c);
        } else if (max == b) {
            middle = Math.max(a, c);
        } else {
            middle = Math.max(b, a);
        }

        int d = Integer.parseInt(String.valueOf(max) + String.valueOf(middle)) + min;

        System.out.println(d);
    }
}