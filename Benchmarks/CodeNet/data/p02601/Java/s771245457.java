import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            if (A >= B)
                B = B *2;
            else if (B >= C){
                C = C*2;
            }
        }
        
        if (A < B && B < C){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
