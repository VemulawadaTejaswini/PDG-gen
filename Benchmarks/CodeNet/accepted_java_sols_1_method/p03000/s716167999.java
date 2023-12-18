import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        int result = 1;
        int d = 0;
        for (int i = 0; i < n && d <= x; i++) {
            d += l[i];
            if (d <= x) {
                result++;
            }
        }

        System.out.println(result);
    }
}
