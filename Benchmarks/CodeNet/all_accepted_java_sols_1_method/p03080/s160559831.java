import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] cArr = sc.next().toCharArray();
        int r = 0;
        int b = 0;

        for (char c : cArr) {
            if (c == 'R') r++;
            if (c == 'B') b++;
        }

        if (r > b) System.out.println("Yes");
        else System.out.println("No");
    }
}