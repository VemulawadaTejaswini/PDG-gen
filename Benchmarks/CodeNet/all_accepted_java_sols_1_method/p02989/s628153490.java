import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int mid = N/2;
        int res = 0;
        if(arr[mid] == arr[mid-1]) {
            res = 0;
        } else {
            res = arr[mid] - arr[mid-1];
        }
        System.out.println(res);
    }
}
