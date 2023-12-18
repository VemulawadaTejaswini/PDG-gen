import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = { 125, 140, 160 };
        while (true) {
            int n = sc.nextInt();
            int d = 3130;
            if (n == -1) {
                break;
            }
            for (int i = 30; i > 0; i -= 10) {
                if (n > i) {
                    d-= (n - i) * c[i / 11];
                    n = i;
                }
            }
            System.out.println(d);
        }
    }
}
