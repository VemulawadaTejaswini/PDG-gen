
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, a;
        x = input.nextInt();
        y = input.nextInt();
        a = (4 * x - y) / 2;
        System.out.println(y % 2 == 0 && a <= x && a >= 0? "Yes" : "No");
    }
}
