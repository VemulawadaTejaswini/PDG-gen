import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int sum = N*L + N*(N-1)/2;
        int abs = 39901;
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (abs > Math.abs(L+i)) {
                result = sum - L - i;
                abs = Math.abs(L+i);
            }
        }
        System.out.println(result);
    }
}