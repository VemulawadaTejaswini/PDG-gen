import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int key = 0;
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == i + 1) {
                continue;
            }
            if (key == 0) {
                key = i + 1;
                value = p[i];
                continue;
            }
            if (key != p[i] || value != i + 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}

