import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxH = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (h >= maxH) {
                maxH = h;
                count++;
            }
        }
        System.out.println(count);
    }
}
