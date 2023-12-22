import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String ans = "No";
        for (int i = 0; i < 3; i++) {
            if (N.charAt(i) == '7') {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
    }
}
