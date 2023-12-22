import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] s = scanner.next().toCharArray();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length; i = i + 2) {
            ans.append(s[i]);
        }

        System.out.println(ans);
    }
}