import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private int MAX = 1000000000;
    private int MAXA = (int)Math.sqrt(MAX+1);
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        boolean[] primes = new boolean[MAXA];
        Arrays.fill(primes, true);
        for (int i = 2; i < MAXA; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < MAXA; j += i) {
                    primes[j] = false;
                }
            }
        }
        int[] xs = new int[input.nextInt()];
        for (int i = 0; i < xs.length; i++) {
            xs[i] = input.nextInt();
        }
        int count = 0;
        for (int x : xs) {
            boolean flag = true;
            for (int i = 2; i * i <= x; i++) {
                if (primes[i] && x % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}