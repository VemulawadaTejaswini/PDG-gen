
import java.util.Scanner;

public class Main {

    private static String solve(int n) {
        if (n % 10 == 2 || n % 10 == 4 || n % 10 == 5 || n % 10 == 7 || n % 10 == 9) {
            return "hon";
        } else if (n % 10 == 6 || n % 10 == 8 || n % 10 == 1 || n % 10 == 0) {
            return "pon";
        } else {
            return "bon";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String res = solve(n);
        System.out.println(res);
    }
}