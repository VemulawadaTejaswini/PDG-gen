import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] ary = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
            sum += a;
        }
        Arrays.sort(ary, Comparator.reverseOrder());
        if (ary[0] < sum - ary[0]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}