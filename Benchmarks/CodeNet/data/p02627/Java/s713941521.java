import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        if (c - 'Z' > 0) {
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}