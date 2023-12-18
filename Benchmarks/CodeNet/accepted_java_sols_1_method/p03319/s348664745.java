import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.nextLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int K = Integer.parseInt(a[1]);

        System.out.println((N - 1 + K - 2) / (K - 1));
    }
}