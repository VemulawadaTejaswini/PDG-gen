import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N-2; i++) {
            int max = Math.max(Math.max(ar[i], ar[i+1]), ar[i+2]);
            int min = Math.min(Math.min(ar[i], ar[i+1]), ar[i+2]);
            if (ar[i+1] != max && ar[i+1] != min) {
                count++;
            }
        }
        System.out.println(count);
    }
}