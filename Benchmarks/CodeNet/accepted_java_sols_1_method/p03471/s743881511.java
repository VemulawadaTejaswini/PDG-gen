import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long y = sc.nextLong();
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                if (y == 10000 * i + 5000 * j + 1000 * (n - i - j)) {
                    StringJoiner sj = new StringJoiner(" ");
                    sj.add(String.valueOf(i));
                    sj.add(String.valueOf(j));
                    sj.add(String.valueOf(n - i - j));
                    System.out.println(sj.toString());
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }

}
