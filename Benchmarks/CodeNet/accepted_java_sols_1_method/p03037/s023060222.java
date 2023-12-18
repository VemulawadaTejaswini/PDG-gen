import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int maxL = 0;
        int minR = 100001;

        for (int i = 0; i < m; i++) {
            maxL = Math.max(maxL, Integer.parseInt(sc.next()));
            minR = Math.min(minR, Integer.parseInt(sc.next()));
        }

        System.out.println((minR >= maxL) ? minR - maxL + 1 : 0);
    }
}
