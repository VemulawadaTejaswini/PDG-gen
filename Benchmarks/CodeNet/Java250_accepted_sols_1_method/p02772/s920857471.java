import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        // 偶数の数全体と、数え上げ偶数の数
        int totalEven = 0;
        int cntEven = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) {
                totalEven++;
            }
            if (A[i] % 6 == 0 || A[i] % 10 == 0) {
                cntEven++;
            }
        }

        if (totalEven == cntEven) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}