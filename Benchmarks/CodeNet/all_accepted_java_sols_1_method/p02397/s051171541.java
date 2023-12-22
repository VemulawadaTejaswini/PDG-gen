import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int[] xs = new int[]{input.nextInt(), input.nextInt()};
            if (xs[0] == 0 && xs [1] == 0) break;
            if (xs[0] > xs[1]) {
                int temp = xs[1];
                xs[1] = xs[0];
                xs[0] = temp;
            }
            System.out.println(String.format("%d %d", xs[0], xs[1]));
        }
    }
}