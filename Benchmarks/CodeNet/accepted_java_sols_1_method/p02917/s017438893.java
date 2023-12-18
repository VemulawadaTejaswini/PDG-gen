import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] b = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        Integer[] a = new Integer[n - 1];
        for (int i = 0; i < n - 2; i++) {
            if (b[i] < b[i+1]) {
                a[i] = b[i];
            } else {
                a[i] = b[i + 1];
            }
        }
        a[a.length - 1] = b[b.length - 1];

        int result = b[0];
        for (int num : a) {
            result+=num;
        }

        System.out.println(result);
    }
}
