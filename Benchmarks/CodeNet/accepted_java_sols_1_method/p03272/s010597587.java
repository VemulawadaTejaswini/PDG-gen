import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int i = in.nextInt() - 1;
            System.out.println(N - i);
        }
    }
}
