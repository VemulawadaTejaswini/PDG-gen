import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if((A==B && B==C) || (A!=B) && B!= C && C != A) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        return;
    }
}