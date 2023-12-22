import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int str = scanner.nextInt();
        int cnt = scanner.nextInt();

        if (str > cnt) {
            int t = str;
            str = cnt;
            cnt = t;
        }

        for (int i=0; i<cnt; i++) {
            System.out.print(str);
        }
    }
}