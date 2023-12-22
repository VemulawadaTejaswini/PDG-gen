import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (i == k - 1) {
                sb.append(String.valueOf(c).toLowerCase());
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}