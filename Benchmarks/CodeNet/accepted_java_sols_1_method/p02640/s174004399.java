import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            if ((y - (2 * i)) % 4 == 0) {
                int j = (y - (2 * i)) / 4;
                if (i + j == x) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}