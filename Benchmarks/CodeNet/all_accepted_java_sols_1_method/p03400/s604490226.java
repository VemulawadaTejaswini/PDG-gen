import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt();
        int a[] = new int[n];
        long count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 1, k = 0; j <= d; j++) {
                if (j == k * a[i] + 1) {
                    count++;
                    k++;
                }
            }
        }
        System.out.println(count + x);
    }
}