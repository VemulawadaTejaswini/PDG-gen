import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N - 1; i++) {
            int A = sc.nextInt();
            a[A - 1]++;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
