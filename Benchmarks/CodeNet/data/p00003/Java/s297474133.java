import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            boolean check = A * A + B * B == C * C || A * A + C * C == B * B || B * B + C * C == A * A;
            System.out.println(check ? "YES" : "NO");
        }
    }
}
