import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) xs[i] = input.nextInt();
        
        // sort
        int count = 0;
        for (int i = 0; i < xs.length; i++) {
            int min = i;
            for (int j = i; j < xs.length; j++) {
                if (xs[j] < xs[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = xs[i];
                xs[i] = xs[min];
                xs[min] = temp;
                count++;
            }
        }
        print(xs);
        System.out.println(count);
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}