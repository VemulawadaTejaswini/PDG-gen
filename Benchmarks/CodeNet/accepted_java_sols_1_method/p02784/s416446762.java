import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += in.nextInt();
        }

        if (total >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
