import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = (int) (b / 0.1);
        int max = min;
        int cur = (int) (max * 0.1);
        while (b == cur) {
            max++;
            cur = (int) (max * 0.1);
        }
        boolean hit = false;
        for (int i = min; i < max; i++) {
            int at = (int) (i * 0.08);
            int bt = (int) (i * 0.1);
            if (at == a && bt == b) {
                System.out.println(i);
                hit = true;
                break;
            }
        }
        if (!hit) {
            System.out.println(-1);
        }
    }
}