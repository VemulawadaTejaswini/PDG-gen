import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fruit = scan.nextInt();
        int num = scan.nextInt();

        int[] arr = new int[fruit];

        for (int i = 0; i < fruit; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
