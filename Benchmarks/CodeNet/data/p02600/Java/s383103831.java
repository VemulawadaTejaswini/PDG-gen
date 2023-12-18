import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int ans = 8;
        int n = sc.nextInt();
        if (n >= 1800) {
            ans--;
        }
        if (n >= 1600) {
            ans--;
        }
        if (n >= 1400) {
            ans--;
        }
        if (n >= 1200) {
            ans--;
        }
        if (n >= 1000) {
            ans--;
        }
        if (n >= 800) {
            ans--;
        }
        if (n >= 600) {
            ans--;
        }
        System.out.println(ans);
    }
}