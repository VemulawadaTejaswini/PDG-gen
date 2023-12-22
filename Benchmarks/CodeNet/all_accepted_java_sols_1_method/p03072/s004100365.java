import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int count = 0;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            if (h[i] >= maxHeight) {
                maxHeight = h[i];
                count++;
            }
        }
        System.out.println(count);
    }
}