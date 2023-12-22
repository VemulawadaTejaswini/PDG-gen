import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC148B - Strings with the Same Length

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();
        String t = sc.next();

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        StringBuffer sb = new StringBuffer("");

        for (int i = 0; i < n; i++) {
            sb = sb.append(cs[i]);
            sb = sb.append(ct[i]);
        }

        System.out.println(sb);
    }
}