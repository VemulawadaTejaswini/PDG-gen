import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] origin = new int[n];
        int[] sorted = new int[n];
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            origin[i] = num;
            sorted[i] = num;
        }
        Arrays.sort(sorted);
        int medianIndex1 = sorted.length / 2 - 1;
        int median1 = sorted[medianIndex1];
        int medianIndex2 = sorted.length / 2;
        int median2 = sorted[medianIndex2];
        for(int i = 0; i < n; i++) {
            if(origin[i] <= median1) {
                System.out.println(median2);
            } else {
                System.out.println(median1);
            }
        }
    }
}