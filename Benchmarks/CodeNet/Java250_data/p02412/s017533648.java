import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            int x = input.nextInt();
            if (n == 0 && x == 0) break;
            
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (x == i + j + k) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}