import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if(k >= n) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i < n - k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}