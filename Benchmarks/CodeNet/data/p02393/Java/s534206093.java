import java.util.Scanner;

class Main{

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }

        if (n[0] > n[1]) { n = swap(n, 0, 1); }
        if (n[0] > n[2]) { n = swap(n, 0, 2); }
        if (n[1] > n[2]) { n = swap(n, 1, 2); }

        System.out.printf("%d %d %d\n", n[0], n[1], n[2]);
    }

    static int[] swap(int[] n, int i, int j) {
        int tmp = n[i];
        n[i] = n[j];
        n[j] = tmp;

        return n;
    }
}

