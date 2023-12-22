import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int alice = 0;
        int bob = 0;
        for(int j = 0; j < N; j++) {
            if(j % 2 == 0) {
                alice += arr[N - 1 - j];
            } else {
                bob += arr[N - 1 -j];
            }
        }
        System.out.println(alice - bob);
    }
}
