import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        char[] sch = s.toCharArray();
        String t = sc.next().trim();
        char[] tch = t.toCharArray();

        int ans = 0;

        for (int i = 0; i < sch.length; i++) {
            if (sch[i] != tch[i]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}