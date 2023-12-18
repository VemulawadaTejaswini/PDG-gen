import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s[] = scanner.nextLine().split("");
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (s[i].equals("W") && s[j].equals("R")) {
                    s[i] = "R";
                    s[j] = "W";
                    c++;
                }
            }
        }

        System.out.println(c);
        scanner.close();
    }
}
