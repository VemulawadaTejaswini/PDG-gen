import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if (sum % 10 != 0) System.out.println(sum);
        else {
            Arrays.sort(arr);
            for (int i : arr) {
                if (i % 10 != 0) {
                    System.out.println(sum - i);
                    return;
                }
            }

            System.out.println(0);
        }
    }
}


