import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        char before = s.charAt(0);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != before) {
                before = s.charAt(i);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
