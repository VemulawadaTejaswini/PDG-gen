import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            char[] cs = in.next().toCharArray();
            Arrays.sort(cs);
            s[i] = new String(cs);
        }

        Arrays.sort(s);

        String before = "";
        long same = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (!s[i].equals(before)) {
                total += same * (same - 1) / 2;
                same = 1;
                before = s[i];
            } else {
                same++;
            }
        }
        total += same * (same - 1) / 2;
        System.out.println(total);
    }
}