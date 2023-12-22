import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] A = new int[M + 1];
        int[] costs = new int[]{0,0};
        for (int i = 1; i <= M; i++) {
            A[i] = sc.nextInt();
            if (A[i] < X) {
                costs[0] += 1;
            } else if (A[i] > X) {
                costs[1] += 1;
            }
        }

        System.out.println(Math.min(costs[0], costs[1]));

        return;
    }

}