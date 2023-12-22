import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();

        int eat = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i<=N; i++) {
            int m = L + i -1;
            sum += m;
            if (Math.abs(m) < Math.abs(eat)) {
                eat = m;
            }
        }
        System.out.println(sum - eat);
    }
}
