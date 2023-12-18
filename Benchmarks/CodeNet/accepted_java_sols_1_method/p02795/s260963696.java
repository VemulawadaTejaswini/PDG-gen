import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        int base = 0;
        int target = 0;
        if (H > W) {
            base = H;
            target = W;
        } else {
            target = H;
            base = W;
        }
        int count = 0;
        for (int i = 1; i <= target; i++) {
            count++;
            N = N - base;
            if (N <= 0) {
                break;
            }
        }

        System.out.println(count);
    }
}

