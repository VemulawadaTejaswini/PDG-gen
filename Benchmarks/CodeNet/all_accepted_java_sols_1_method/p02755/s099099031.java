import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int base = b * 10;

        int ans = -1;
        for (int i = base; i < base + 10; i++) {
            int cal = i * 8 / 100;
            if (cal == a) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}