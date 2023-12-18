import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = 2000000000;
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            min = Math.min(min, numbers[i]);
        }
        
        while (true) {
            boolean end = true;
            int nextMin = min;
            for (int i = 0; i < n; i++) {
                if (min == numbers[i]) continue;
                
                end = false;
                numbers[i] = numbers[i] % min;
                if (numbers[i] == 0) {
                    numbers[i] = min;
                }
                if (numbers[i] < min) {
                    nextMin = numbers[i];
                }
            }
            
            if (nextMin != min) {
                min = nextMin;
            }
            
            if (end) {
                System.out.println(min);
                break;
            }
        }
    }
}