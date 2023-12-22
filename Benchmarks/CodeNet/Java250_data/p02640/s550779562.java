import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());

            String ans = "";
            if (y % 2 != 0) {
                ans = "No";
            } else {
                if ((y / 2) >= x && x >= ((y / 4)+(y % 4 / 2)) ) {
                    ans = "Yes";
                } else {
                    ans = "No";
                }
            }
            System.out.println(ans);
        }
    }
}
