import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = 0, B = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
            A = Integer.parseInt(sc.next());
            } else {
                B = Integer.parseInt(sc.next());
                sum += Math.max(A - B, 0);
                A = B + Math.max(A - B, 0);
            }

        }
        System.out.println(sum);

    }
}