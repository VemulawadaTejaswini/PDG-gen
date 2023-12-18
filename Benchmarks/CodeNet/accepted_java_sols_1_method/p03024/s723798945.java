import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int cnt = 0;
            for (char c : s.toCharArray()) {
                if (c == 'x') {
                    ++cnt;
                }
            }
            System.out.println(cnt < 8 ? "YES" : "NO");
        }
        sc.close();
    }
}
