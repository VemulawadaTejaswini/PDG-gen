import java.util.Scanner;

public class Main {

    private static final String UPPER_CASE = "[A-Z]";

    private static final String LOWER_CASE = "[a-z]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches(UPPER_CASE) ? "A" : "a");
    }
}