import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        if (h == w) {
            if (n % w == 0) {
                int needRow = n / w;
                System.out.println(needRow);
                return;
            }
            int needRow = n / w + 1;
            System.out.println(needRow);
        } else {
            if (h > w) {
                if (n % h == 0) {
                    int needRow = n / h;
                    System.out.println(needRow);
                    return;
                }
                int needRow = n / h  + 1;
                System.out.println(needRow);
            } else {
                if (n % w == 0) {
                    int needRow = n / w;
                    System.out.println(needRow);
                    return;
                }
                int needRow = n / w + 1;
                System.out.println(needRow);
            }
        }
    }
}