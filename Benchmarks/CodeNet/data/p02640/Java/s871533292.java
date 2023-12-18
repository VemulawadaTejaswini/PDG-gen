
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        String ans = "No";
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= (x - i); j++) {
                if (((i + j) == x) && (((2 * i) + (4 * j)) == y)) {
                    ans = "Yes";
                    break;
                }

            }
        }

        System.out.println(ans);
    }

}
