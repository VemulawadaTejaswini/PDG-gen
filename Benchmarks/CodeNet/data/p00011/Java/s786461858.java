import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int w = sc.nextInt();
            int[] set = new int[w + 1];
            for (int i = 1; i <= w; i++) {
                set[i] = i;
            }
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                String[] token = s.split(",");
                a[i] = Integer.parseInt(token[0]);
                b[i] = Integer.parseInt(token[1]);
            }
            for (int i = 0; i < n; i++) {
                swap(a[i], b[i], set);
            }
            for (int i = 1; i <= w; i++) {
                System.out.println(set[i]);
            }
        }
    }

    private static void swap(int a, int b, int[] set) {
        int temp;
        temp = set[a];
        set[a] = set[b];
        set[b] = temp;
    }
}
