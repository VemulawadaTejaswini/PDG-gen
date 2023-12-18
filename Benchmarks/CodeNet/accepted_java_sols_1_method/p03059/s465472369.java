import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int time = 0;
        int biscuitNum = 0;

        if(A <= T) {
            time += A;
            for (int i = 0; time <= T + 0.5; ++i) {
                time += A;
                biscuitNum += B;
            }
        }
        System.out.println(biscuitNum);
    }
}
