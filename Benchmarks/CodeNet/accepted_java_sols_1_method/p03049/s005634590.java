import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int ab = 0;
        int startBEndA = 0;
        int startB = 0;
        int endA = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            for (int j = 0; j < s[i].length() - 1; j++) {
                if (s[i].charAt(j) == 'A' && s[i].charAt(j + 1) == 'B') {
                    ab++;
                }
            }
            if (s[i].startsWith("B") && s[i].endsWith("A")) {
                startBEndA++;
                continue;
            }
            if (s[i].startsWith("B")) {
                startB++;
            }
            if (s[i].endsWith("A")) {
                endA++;
            }
        }
        int ans = ab;
        if (startBEndA == 0) {
            ans += Math.min(startB, endA);
        } else {
            if (startB + endA > 0) {
                ans += startBEndA + Math.min(startB, endA);
            } else {
                ans += startBEndA - 1;
            }
        }
        System.out.println(ans);
    }

}
