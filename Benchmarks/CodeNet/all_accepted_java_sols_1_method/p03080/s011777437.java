
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        int red = 0;
        int blue = 0;
        for (char si : s.toCharArray()) {
            if (si == 'R') {
                red += 1;
            } else {
                blue += 1;
            }
        }

        if (red > blue) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
