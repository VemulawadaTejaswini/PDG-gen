import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++ ) {
            for(int j = n - 1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int v = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = v;
                    count++;
                }
            }
        }

        System.out.print(arr[0]);
        for(int i = 1; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        System.out.println(count);

    }
}