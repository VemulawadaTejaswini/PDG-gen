import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] map = new int[n + 1];
            System.out.println(fib(n, map));
        }
    }
    static int fib(int n, int[] map) {
        if      (n == 0) return 1;
        else if (n == 1) return 1;
        else if (map[n] != 0) return map[n];
        else { map[n] = fib(n - 1, map) + fib(n - 2, map); 
            return map[n];
        }
    }
}