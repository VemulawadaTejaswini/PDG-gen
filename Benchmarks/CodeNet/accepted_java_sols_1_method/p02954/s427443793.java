import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[s.length()];
        Arrays.fill(a, -1);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
                a[i] = 1;
                a[i + 1] = 1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' && a[i] == -1) {
                a[i] = 0;
                cnt++;
            } else if (a[i] != -1 && cnt > 0) {
                if (cnt % 2 == 0) {
                    a[i] += cnt / 2;
                    a[i + 1] += cnt / 2;
                } else {
                    a[i] += cnt / 2;
                    a[i + 1] += cnt / 2 + 1;
                }
                cnt = 0;
            }
        }
        cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'L' && a[i] == -1) {
                a[i] = 0;
                cnt++;
            } else if (a[i] != -1 && cnt > 0) {
                if (cnt % 2 == 0) {
                    a[i] += cnt / 2;
                    a[i - 1] += cnt / 2;
                } else {
                    a[i] += cnt / 2;
                    a[i - 1] += cnt / 2 + 1;
                }
                cnt = 0;
            }
        }
        System.out.println(Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}