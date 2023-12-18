import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int[] a = new int[H];
        for (int i = 0; i < H; i++) {
            a[i] = scanner.nextInt();
        }
        builMaxHeap(a);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            sb.append(" " + String.valueOf(a[i]));
        }
        System.out.println(sb.toString());
    }

    private static void maxHeapify(int[] a, int i) {
        int l = (i + 1) * 2 - 1;
        int r = (i + 1) * 2;
        int largest = i;
        if (l < a.length && a[l] > a[i]) {
            largest = l;
        }
        if (r < a.length && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            maxHeapify(a, largest);
        }
    }

    private static void builMaxHeap(int[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            maxHeapify(a, i);
        }
    }
}