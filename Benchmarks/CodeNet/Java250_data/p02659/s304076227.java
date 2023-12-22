import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String[] B = sc.next().split("\\.");

        int b1 = Integer.parseInt(B[0]);
        int b2 = Integer.parseInt(B[1]);
        //System.out.println(b1);
        //System.out.println(b2);

        int b = b1 * 100 + b2;
        long ans = A * b;
        System.out.println(ans/100);
        return;
    }

}