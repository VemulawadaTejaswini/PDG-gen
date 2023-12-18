import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if(Y % 2 == 1){
            System.out.println("No");
            return;
        }

        int A = 2*X-Y/2;
        int B = Y/2 - X;

        if(A >= 0 && B >= 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
