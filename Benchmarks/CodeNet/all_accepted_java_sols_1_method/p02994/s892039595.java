import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int taste = (n * (l + l + n - 1)) / 2;
        int max = n + l - 1;

        if (l < 0 && max < 0) {
            taste -= max;
        } else if (l > 0) {
            taste -= l;
        }

        System.out.println(taste);
    }
}