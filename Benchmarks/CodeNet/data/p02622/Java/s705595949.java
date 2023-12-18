import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        n = a.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }

        }

        System.out.print(count);

    }
}