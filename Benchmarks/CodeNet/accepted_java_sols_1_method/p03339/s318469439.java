import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int temp = 0;
        int max = 0;
        int idx = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                temp++;
            } else {
                temp--;
            }
            if (temp < max) {
                idx = i;
                max = temp;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == idx) {
                continue;
            } else if (i < idx && s.charAt(i) == 'W') {
                ans++;
            } else if (i > idx && s.charAt(i) == 'E') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}