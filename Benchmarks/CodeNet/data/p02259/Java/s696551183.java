
import java.util.Scanner;

public class Main {
    public static void trace(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }

    public static int bubbleSort(int[] a, int n) {
        int i = 0;
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = n - 1; j >= i + 1; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    flag = true;
                    count++;
                }
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int count = bubbleSort(a, n);
        trace(a, n);
        System.out.println(count);
    }
}

