import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
        int max = numbers[n - 1];
        int r = -1;
        
        double mid = max / 2.0;
        double minGap = max;
        for (int i = 0; i < n; i++) {
            double gap = Math.abs(mid - numbers[i]);
            if (gap < minGap) {
                minGap = gap;
                r = numbers[i];
            }
        }
        
        System.out.println(max + " " + r);
    }
}