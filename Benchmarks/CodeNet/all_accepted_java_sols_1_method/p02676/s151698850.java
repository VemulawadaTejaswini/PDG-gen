import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        if (s.length() <= k) {
            System.out.println(s);
        } else {
            int sub = k - s.length();
            System.out.print(s.substring(0, k));
            System.out.println("...");
        }
    }
}