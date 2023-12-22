import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = n - 1; j > 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(arr[0]);
        sc.close();
    }
}
