import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N == 1){
            System.out.println("Hello World");
        } else if (N == 2){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        } else throw new IllegalArgumentException();
    }
}
