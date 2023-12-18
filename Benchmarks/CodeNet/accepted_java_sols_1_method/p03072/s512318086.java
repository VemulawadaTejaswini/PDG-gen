import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0, max = 0;
        for (int i =0; i < N; i++) {
            int h = sc.nextInt();
            if (h >= max) {
                total++;
            }
            max = Math.max(max, h);
        }
        System.out.println(total);
    }
}
