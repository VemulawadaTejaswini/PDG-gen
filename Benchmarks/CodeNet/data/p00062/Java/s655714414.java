import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] n = sc.next().toCharArray();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10 - i - 1; j++) {
                    n[j] = (char) ((n[j] + n[j + 1] - '0' - '0') % 10 + '0');
                }
            }
            System.out.println(n[0] - '0');
        }
    }
}
