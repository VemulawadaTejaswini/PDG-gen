import java.util.Scanner;

class Main {
    private static void swap(int[] a, int i, int j) {
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; ++i) {
            a[i] = get.nextInt();
        }
        swap(a, 0, 1);
        swap(a, 0, 2);
        for(int i = 0; i < 3; ++i) {
            System.out.print(a[i] + " ");
        }
    }
}