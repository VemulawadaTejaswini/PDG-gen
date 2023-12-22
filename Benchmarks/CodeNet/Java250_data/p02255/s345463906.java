import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        toPrint(arr, n);

        for(int i = 1; i < n; i++) {
            int v = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > v ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = v;
            toPrint(arr, n);
        }

    }

    public static void toPrint(int[] arr, int n) {
        System.out.print(arr[0]);
        for(int i = 1; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}