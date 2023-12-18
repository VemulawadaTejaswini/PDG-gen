import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int b10th = -1, b5th = -1, b1th = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), y = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + j > n) {
                    break;
                }
                int k = n - i - j;
                if (10000*i + 5000*j + 1000*k == y) {
                    b10th = i; b5th = j; b1th = k;
                }
            }
        }

        System.out.println(b10th + " " + b5th + " " + b1th);
    }
}
