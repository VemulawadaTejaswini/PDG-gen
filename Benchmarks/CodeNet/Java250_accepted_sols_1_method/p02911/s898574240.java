import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int q = std.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < q; i++) {
            int answer = std.nextInt() - 1;
            points[answer] += 1;
        }

        for (int i = 0; i < n; i++) {
            int minusPoint = q - points[i];
            if(k - minusPoint > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}