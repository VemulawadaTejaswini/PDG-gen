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

        int count = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    System.out.println(count);
                    return;
                }
                a[i] /= 2;
            }
            count++;
        }
    }
}
