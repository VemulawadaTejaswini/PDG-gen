import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(s.length() - 1);
        if (c == '3') {
            System.out.println("bon");
        } else if (c == '0' || c == '1' || c == '6' || c == '8') {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}