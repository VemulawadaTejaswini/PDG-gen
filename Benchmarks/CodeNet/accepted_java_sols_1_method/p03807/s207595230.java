import java.util.Scanner;

/**
 * Created by zzt on 17-2-4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int oddCount = 0;
        int a;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a%2!=0)
                oddCount++;
        }
        System.out.println(oddCount%2==0?"YES":"NO");
    }
}