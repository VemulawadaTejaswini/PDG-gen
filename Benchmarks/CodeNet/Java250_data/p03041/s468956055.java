import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                sb.appendCodePoint(s.charAt(i) + 32);
            } else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
