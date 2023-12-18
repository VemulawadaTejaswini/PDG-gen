import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0;

        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (i != j && arr[i] % arr[j] == 0){
                    break;
                }
            }
            if (j == N) sum++;
        }
        System.out.println(sum);

    }
}
