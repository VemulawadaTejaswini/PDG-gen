import java.util.Scanner;
class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();


            if (A * A + B * B == C * C) {
                System.out.println("YES");
            } else if (A * A + C * C == B * B) {
                System.out.println("YES");
            } else if (C * C + B * B == A * A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
