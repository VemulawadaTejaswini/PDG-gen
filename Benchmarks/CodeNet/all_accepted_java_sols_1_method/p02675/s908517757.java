import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n%10;
        String ans = "";
        if (r == 2 || r == 4 || r == 5 || r == 7 || r == 9) {
            ans = "hon";
        }
        else if (r == 0 || r == 1 || r == 6 || r == 8) {
            ans = "pon";
        }
        else {
            ans = "bon";
        }

        System.out.println(ans);
    }
}
