import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        int maxL = 0;
        for (int i = 0; i < n; ++i) {
            int l = scan.nextInt();
            maxL = Math.max(maxL, l);
            sum += l;
        }

        if (maxL < sum - maxL) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}