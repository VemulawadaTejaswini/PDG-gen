import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }
        Arrays.sort(v);

        for (int i = 1; i < n; i++) {
            v[i] = (v[i] + v[i - 1]) / 2;
            v[i - 1] = 0;
        }
        System.out.println(v[n-1]);
    }
}

