import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] list = new int[n];
        int lastValue = 0;
        for (int i = 1; i < n; i++) {
            if (s.substring(i - 1, i + 1).equals("AC")) {
                lastValue++;
            }
            list[i] = lastValue;
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            System.out.println(list[r] - list[l]);
        }
    }
}