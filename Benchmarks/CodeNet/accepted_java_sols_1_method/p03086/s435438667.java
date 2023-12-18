import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.next());
        String s = sc.next();

        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("A") || s.substring(i, i + 1).equals("T")
                    || s.substring(i, i + 1).equals("G") || s.substring(i, i + 1).equals("C")) {
                tmp++;
                ans = Math.max(tmp, ans);
            } else {
                ans = Math.max(tmp, ans);
                tmp = 0;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}