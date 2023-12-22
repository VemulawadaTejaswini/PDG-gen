import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int count = 1;
        int d = 0;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            d = d + l;
            if (d <= x) {
                count++;
            }
        }

        System.out.println(count);

    }
}
