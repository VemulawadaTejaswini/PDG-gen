import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num - 1 != i) x++;
        }

        if (x <= 2) System.out.println("YES");
        else System.out.println("NO");
    }
}
