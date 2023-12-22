import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println("Yes");
            return;
        }

        int H[] = new int[N];
        for (int i=0;i<N;i++) {
            H[i] = sc.nextInt();
        }

        for (int i=N-1;i>0;i--) {
            if (H[i-1] - H[i] > 1) {
                System.out.println("No");
                return;
            }
            if (H[i-1] - H[i] > 0) {
                H[i-1] -= 1;
            }
        }
        System.out.println("Yes");
    }
}
