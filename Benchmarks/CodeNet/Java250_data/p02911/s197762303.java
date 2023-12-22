import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int q = sc.nextInt();
        int[] a = new int[q];
        int[] win = new int[n];
        for (int i = 0; i < q; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            win[a[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (k - (q - win[i]) > 0) {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
    
}
