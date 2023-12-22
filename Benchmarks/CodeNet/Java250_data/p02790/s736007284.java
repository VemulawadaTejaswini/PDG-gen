
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder ans = new StringBuilder();
        int i;

        if (a < b) {
            for (i = 0; i < b; i++) {
                ans.append(String.valueOf(a));
            }
        }
        else {
            for (i = 0; i < a; i++) {
                ans.append(String.valueOf(b));
            }
        }

        System.out.println(ans.toString());
    }
}