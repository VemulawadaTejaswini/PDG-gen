import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y = sc.nextInt();

        sc.close();

        int sum = 0;
        // 10000yen
        int C = 0;

        for(int A = 0; A <= N; A++) { // 1000yen
            for(int B = 0; B <= N; B++) {
                C = N - A - B;
                sum = 10000 * C + 5000 * B + 1000 * A;
                if(sum == Y && A >= 0 && B >= 0 && C >= 0) {
                    System.out.println(C + " " + B + " " + A);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}