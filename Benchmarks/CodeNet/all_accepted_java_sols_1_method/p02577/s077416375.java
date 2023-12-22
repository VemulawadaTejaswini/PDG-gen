import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.next());
        String n = sc.next();
        if ("0".equals(n)) {
            System.out.println("Yes");
            return;
        }
        long num = 0;
        for (int i = 0; i < n.length(); i++) {
            num += Character.getNumericValue(n.charAt(i));
        }
        if (num % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}