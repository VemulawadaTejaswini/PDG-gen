import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int dist = 0;
        int min = Integer.MAX_VALUE;
        for(int p = arr[0]; p <= arr[n-1]; p++) {
            dist = 0;
            for(int i = 0; i < n; i++) {
              dist += Math.pow(arr[i]-p, 2);
            }
            min = Math.min(min, dist);
        }
        System.out.println(min);
    }
}