import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) a.add(scan.nextInt());
        int k = 1;

        for (int item : a
        ) {
            if (item == k) {
                k++;
            }
        }

        if (k == 1) {
            System.out.println(-1);
        } else {
            System.out.println(n - (k - 1));
        }
    }
}
