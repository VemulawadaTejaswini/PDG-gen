import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        int result = t.length;
        for (int i = 0; i <= s.length - t.length; i++) {
            int diff = 0;
            for (int j = 0; j < t.length; j++) {
                if (!t[j].equals(s[i+j])) diff++;
            }
            result = Math.min(result, diff);
        }
        System.out.println(result);
    }
}
