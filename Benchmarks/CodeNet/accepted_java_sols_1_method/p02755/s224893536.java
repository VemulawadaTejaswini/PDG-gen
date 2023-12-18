import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 1000; i++) {
            int aa = i * 8 / 100;
            int bb = i * 10 / 100;
            if (aa > 0 && bb > 0 && a == aa && b == bb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}