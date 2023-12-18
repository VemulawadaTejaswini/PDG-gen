import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0, idx = 0;
        long cost = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (max < a[j]) {
                    max = a[j];
                    idx = j;
                }
            }
            if (idx != i) {
                int tmp = a[i];
                a[i] = a[idx];
                a[idx] = tmp;
                cost += a[i] + a[idx];
            }
            max = 0;
        }
        System.out.println(cost);
    }
}