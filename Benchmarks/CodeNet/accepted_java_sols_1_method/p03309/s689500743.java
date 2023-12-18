import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arr[i] -= i+1;
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            sum += Math.abs(arr[i] - arr[n/2]);
        }
        System.out.println(sum);
    }
}