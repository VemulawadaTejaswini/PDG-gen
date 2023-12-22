import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        Integer[] b = new Integer[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        ArrayList<Integer[]> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] a = new Integer[m];
            for (int j = 0; j < m; j++) {
                a[j] = Integer.parseInt(sc.next());
            }
            aList.add(a);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += aList.get(i)[j] * b[j];
            }
            if (sum + c > 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}