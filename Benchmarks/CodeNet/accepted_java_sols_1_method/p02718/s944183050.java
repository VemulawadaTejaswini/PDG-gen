import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        long all = 0;
        scanner.nextLine();
        int a;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            inputs.add(a);
            all += a;
        }
        inputs.sort(Collections.reverseOrder());
        int c = 0;
        double b = all / 4.0;
        b /= m;
        for (Integer input : inputs) {
            if (c == m-1) {
                if (b <= (double) input) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                return;
            }
            c++;
        }
    }

}