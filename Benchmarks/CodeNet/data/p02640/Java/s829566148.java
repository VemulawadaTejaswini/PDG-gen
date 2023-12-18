
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = input.nextInt();
        y = (4 * x - y) / 2;
        System.out.println(y <= x && y >= 0? "Yes" : "No");
    }
}
