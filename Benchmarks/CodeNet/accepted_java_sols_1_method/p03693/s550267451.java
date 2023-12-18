import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String r = scanner.next();
        String g = scanner.next();
        String b = scanner.next();
        int rgb = Integer.parseInt(r+g+b);

        if (rgb % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}