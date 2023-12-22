import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] d = new int[N];
        boolean[] flags = new boolean[100];
        for (int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
            flags[d[i] - 1] = true;
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (flags[i]) count++;
        }
        System.out.println(count);
    }
}
