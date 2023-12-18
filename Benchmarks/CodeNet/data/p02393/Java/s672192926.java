import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] > a[1]) {
            swap(a, 0, 1);
        }
        if (a[1] > a[2]) {
            swap(a, 1, 2);
        }
        if (a[0] > a[1]) {
            swap(a, 0, 1);
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
}

