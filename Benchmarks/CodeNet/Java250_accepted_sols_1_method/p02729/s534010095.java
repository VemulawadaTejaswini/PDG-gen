import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] mn = line.split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int ans = m  * (m - 1) / 2  + n * (n - 1) / 2;

        System.out.println(ans);

    }
}
