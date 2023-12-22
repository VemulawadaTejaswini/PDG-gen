import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] >= max) {
                count++;
                max = h[i];
            }
        }
        System.out.println(count);
    }
}
