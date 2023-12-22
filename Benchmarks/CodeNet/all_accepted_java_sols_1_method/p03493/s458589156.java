import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            int a = Integer.parseInt(s[i]);
            if (a == 1) {
                x++;
            }
        }
        System.out.println(x);
        scanner.close();
    }
}
