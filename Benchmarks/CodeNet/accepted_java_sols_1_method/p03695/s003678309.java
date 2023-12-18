import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rates[] = new int[8];
        int ored = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp >= 3200) {
                ored++;
                continue;
            }
            rates[(int) tmp / 400] = tmp;
        }
        int ans = 0;
        int check = 0;
        for (int i = 0; i < 8; i++) {
            if (rates[i] != 0)
                ans++;
            check += rates[i];
        }
        boolean isRed = false;
        if (check == 0) {
            ans = 1;
            isRed = true;
        }
        System.out.print(ans + " ");
        if (ored > 0) {
            ans += ored;
            if (isRed)
                ans--;
        }
        System.out.println(ans);
    }
}