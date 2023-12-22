import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - 2; i++) {
            String tmp = s.substring(i, i + 3);
            int tmp2 = Integer.parseInt(tmp);
            ans = Math.min(ans, Math.abs(753 - tmp2));
        }
        System.out.println(ans);
    }
}