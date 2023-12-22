import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int a[] = {1, 100, 10000};
        int D;
        int N;
        Scanner sc = new Scanner(System.in);

        D = sc.nextInt();
        N = sc.nextInt();

        if (N == 100) {
            System.out.println(a[D] * 101);
        } else {
            System.out.println(a[D] * N);
        }
    }
}
