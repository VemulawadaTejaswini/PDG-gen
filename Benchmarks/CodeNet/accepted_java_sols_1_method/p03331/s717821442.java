import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println(Math.log10(n) % 1 == 0 ? 10 : Integer.toString(n).chars().map(c -> c - '0').sum());
    }
}