import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] v = new Integer[n];
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(sc.next());
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int value = v[i] - c[i];
            if (value > 0) {
                result += value;
            }
        }

        System.out.println(result);
    }
}