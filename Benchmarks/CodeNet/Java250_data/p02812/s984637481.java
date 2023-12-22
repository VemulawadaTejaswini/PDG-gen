import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int idx = 0;
        int ans = 0;
        while (idx != -1) {
            idx = s.indexOf("ABC", idx);
            if (idx != -1) {
                ans++;
                s = s.substring(idx + 3);
                idx = 0;
            }
        }
        System.out.println(ans);
    }
}
