import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
        }
        int startWithB_and_endWithA = 0;
        int startWithB = 0;
        int endWithA = 0;
        int internalAB = 0;
        for (int i = 0; i < N; i++) {
            boolean start_b = s[i].charAt(0) == 'B';
            boolean end_a = s[i].charAt(s[i].length()-1) == 'A';
            if (start_b && end_a) {
                startWithB_and_endWithA++;
            } else if (start_b) {
                startWithB++;
            } else if (end_a) {
                endWithA++;
            }
            for (int j = 0; j < s[i].length() - 1; j++) {
                if(s[i].charAt(j) == 'A' && s[i].charAt(j+1) == 'B') {
                    internalAB++;
                }
            }
        }
        int ans = 0;
        if(startWithB_and_endWithA == 0) {
            ans += internalAB + Math.min(startWithB, endWithA);
        } else {
            ans += internalAB + startWithB_and_endWithA - 1;
            if (startWithB > 0) {
                ans++;
                startWithB--;
            }
            if (endWithA > 0) {
                ans++;
                endWithA--;
            }
            ans += Math.min(startWithB, endWithA);
        }
        System.out.println(ans);
    }
}