import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int parent = calcParentIndex(i);
            int left = calcLeftIndex(i);
            int right = calcRightIndex(i);
            StringBuilder sb = new StringBuilder();
            sb.append("node " + (i) + ": " );
            sb.append("key = " + a[i] + ", ");
            if (parent >= 1) sb.append("parent key = " + a[parent] + ", ");
            if (left <= n) sb.append("left key = " + a[left] + ", ");
            if (right <= n) sb.append("right key = " + a[right] + ", ");
            System.out.println(sb.toString());
        }

    }

    private static int calcParentIndex(int i) {
        return i / 2 ;
    }

    private static int calcLeftIndex(int i) {
        return 2 * i;
    }

    private static int calcRightIndex(int i) {
        return 2 * i + 1;
    }
}

