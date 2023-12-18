import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = -1;
        for (int x = 1; x <= 2000; x++) {
            if (8*x/100 == A && 10*x/100 == B) {
                ans = x;
                break;
            }
        }
        System.out.println(ans);
    }
}
