import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int l = s.length();
        int ans = 0;
        if (l == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i< l; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
