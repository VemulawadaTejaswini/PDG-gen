import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        int res = 0;
        int max = arr[N-1];
        for(int i = 0; i < N; i++) {
            if(arr2[i] == max) {
                System.out.println(arr[N-2]);
            } else {
                System.out.println(max);
            }
        }
    }
}
