import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力
        String s = sc.nextLine();
        String t = sc.nextLine();

        // 出力
        String[] array_s = s.split("");
        String[] array_t = t.split("");
        if (array_s.length + 1 != array_t.length) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < array_s.length; i++) {
            if (!array_s[i].equals(array_t[i])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
