public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[3-i] = num % 10;
            num /= 10;
        }

        for (int i = 0; i < 8; i++) {
            int tmp = i + 1;
            int ans = A[0];
            for (int j = 1; j < 4; j++) {
                if (tmp % 2 == 0) ans += A[j];
                else ans -= A[j];
                tmp /= 2;
            }
            if (ans == 7) {
                tmp = i + 1;
                System.out.print(A[0]);
                for (int j = 1; j < 4; j++) {
                    if (tmp % 2 == 0) 
                        System.out.print("+");
                    else System.out.print("-");
                    System.out.print(A[j]);
                    tmp /= 2;
                }
                System.out.println("=7");
                return;
            }
        }
    }
}