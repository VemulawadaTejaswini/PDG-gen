import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int K = sc.nextInt();
        int X = sc.nextInt();
        String ans = (500 * K >= X) ? "Yes" : "No";
        System.out.println(ans);
    }
}