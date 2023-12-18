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
        for (int i = 1; i < n; i++) {
            print(xs);
            int v = xs[i];
            for (int j = i; j > 0; j--) {
                if (xs[j-1] <= v) {
                    xs[j] = v;
                    v = -1;
                    break;
                }
                xs[j] = xs[j-1];
            }
            if (v != -1) xs[0] = v;
        }
        print(xs);
    }
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}