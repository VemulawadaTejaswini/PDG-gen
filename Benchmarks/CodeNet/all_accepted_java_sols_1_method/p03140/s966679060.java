import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            //System.out.println("今のans:" + ans + "\n今のi:" + i);

            if (a.charAt(i) != b.charAt(i) && b.charAt(i) != c.charAt(i) && c.charAt(i) != a.charAt(i)) {
                ans += 2;
            } else if (a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i) && c.charAt(i) == b.charAt(i)) {
                ans += 0;
            } else {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}