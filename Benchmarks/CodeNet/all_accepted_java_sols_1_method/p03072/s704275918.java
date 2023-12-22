import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt();
        int numMts = 1;
        for (int i = 1; i < n; i++) {
            int h = in.nextInt();
            if (h >= max) {
                max = h;
                numMts++;
            }
        }

        System.out.println(numMts);
    }
}
