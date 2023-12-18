import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int d = 0;
            int cnt = 1;
            for (int i = 0; i < n; i++) {
                int l = scanner.nextInt();
                d += l;
                if (d <= x) {
                    cnt++;
                } else {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }

}
