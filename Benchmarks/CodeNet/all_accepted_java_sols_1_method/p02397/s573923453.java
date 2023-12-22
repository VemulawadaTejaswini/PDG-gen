import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, c = 1;
        while (true) {
            String[] str = sc.nextLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            if (x == 0 && y == 0) break;
            if (x < y) System.out.println(x + " " + y);
            else System.out.println(y + " " + x);
        }
    }
}
