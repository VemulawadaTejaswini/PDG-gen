import java.util.*;

public class Main {
    public static void main(String args[]) {
        // input

        int num;

        Scanner inp = new Scanner(System.in);

        num = inp.nextInt();

        int min = inp.nextInt();
        int max = (int) -(Math.pow(10,9));

        for (int i = 0; i < num-1; i++) {
            int r = inp.nextInt();
            max = Math.max(max, r-min);
            min = Math.min(min,r);
        }

        System.out.println(max);
    }
}
