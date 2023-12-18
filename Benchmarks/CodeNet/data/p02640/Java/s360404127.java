
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = input.nextInt();
        System.out.println((4 * x - y) / 2 <= x ? "Yes" : "No");
    }
}
