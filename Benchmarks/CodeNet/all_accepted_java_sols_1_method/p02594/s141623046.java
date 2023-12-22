import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}