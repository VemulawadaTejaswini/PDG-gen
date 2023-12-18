import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String ans = "";
        if (y % 2 == 0 && 2 * x <= y && 4 * x >= y) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);
    }
}