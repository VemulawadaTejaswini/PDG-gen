import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumA += a[n-1 -i];
            } else {
                sumB += a[n-1 -i];
            }
        }
        
        System.out.println(sumA - sumB);
    }
}