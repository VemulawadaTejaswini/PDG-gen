import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int sum = 0;
        int n = 100 * (a[0] - a[1]);
        int m = a[1] * 1900;

        System.out.println((n + m) * (2 << a[1] - 1));
    }
}
