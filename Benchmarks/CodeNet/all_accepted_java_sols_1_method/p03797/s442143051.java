import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        long c = scanner.nextLong();
        long count;
        if (c > s * 2) {
            count = s;
            c -= s * 2;
            count += c / 4;
        } else {
            count = c / 2;
        }
        System.out.println(count);
    }
}
