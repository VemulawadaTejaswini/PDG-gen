import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            int v = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > v) {
                arr[j+1] = arr[j];
                j --;
            }
            arr[j+1] = v;
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

