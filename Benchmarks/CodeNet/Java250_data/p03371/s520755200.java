import java.util.Scanner;

class Solver {

    private final int A;
    private final int B;
    private final int AB;
    private final int X;
    private final int Y;

    Solver(Scanner in){
        A = in.nextInt();
        B = in.nextInt();
        AB = in.nextInt();
        X = in.nextInt();
        Y = in.nextInt();
    }

    void solve() {
        if (A + B <= AB * 2) {
            System.out.println(A * X + B * Y);
            return;
        }
        int max = Math.max(X, Y);
        int min = Math.min(X, Y);
        int temp = A * X + B * Y;
        for (int i = min; i <= max; i++) {
            temp = Math.min(i * 2 * AB + A * Math.max(X - i, 0) + B * Math.max(Y - i, 0), temp);
        }
        System.out.println(temp);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}