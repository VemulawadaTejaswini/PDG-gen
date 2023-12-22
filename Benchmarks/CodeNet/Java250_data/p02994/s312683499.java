class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        final int N = sc.nextInt();
        final int L = sc.nextInt();

        int output = 0;

        if (-1 <= L - 1) {
            output -= L;
        } else if (L - 1 <= -N) {
            output -= L + N - 1;
        }

        output += N * (L - 1) + N * (N + 1) / 2;

        System.out.println(output);
    }
}