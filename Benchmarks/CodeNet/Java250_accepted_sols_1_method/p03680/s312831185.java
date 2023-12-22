import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int next = 0;
        int count = 0;
        int past[] = new int[100000]; 
        Arrays.fill(past, 0);
        while (true) {
            if (next == 1) {
                System.out.println(count);
                return;
            }

            if (past[next] == 1) {
                System.out.println(-1);
                return;
            }

            past[next] = 1;
            next = a[next] - 1;
            count++;
        }
    }
}
