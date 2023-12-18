import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heap = new int[n];
        for (int i = 0; i < n; i++) {
            heap[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(printNode(heap, i));
        }
    }

    static String printNode(int[] heap, int i) {
        String parent;
        if (i > 1) {
            parent = "parent key = " + heap[i/2-1] + ", ";
        } else {
            parent = "";
        }

        if (i * 2 > heap.length) {
            return "node " + i + ": key = " + heap[i-1] + ", " + parent;
        } else if (i * 2 + 1 > heap.length) {
            return "node " + i + ": key = " + heap[i-1] + ", " + parent + "left key = " + heap[i*2-1] + ", ";
        } else {
            return "node " + i + ": key = " + heap[i-1] + ", " + parent + "left key = " + heap[i*2-1] + ", "
                    + "right key = " + heap[i*2] + ", ";
        }
    }
}

