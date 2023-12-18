import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            long max = Long.MIN_VALUE;
            int[] vars = new int[n];
            for (int i = 0; i < n; i++) {
                vars[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                long cur = 0;
                for (int j = i; j < n; j++) {
                    cur+=vars[j];
                    max = max >  cur ? max : cur;
                }
            }
            System.out.println(max);
        }
    }
}
