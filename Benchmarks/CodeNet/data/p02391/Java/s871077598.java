import java.util.Scanner;

public class Main {

    private static final String BIG   = "a > b";
    private static final String SMALL = "a < b";
    private static final String EQUAL = "a == b";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a == b) ? EQUAL : ((a > b) ? BIG : SMALL));
    }
}