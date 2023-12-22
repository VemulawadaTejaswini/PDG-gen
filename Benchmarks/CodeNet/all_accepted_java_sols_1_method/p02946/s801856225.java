import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt(), X = in.nextInt();

        for (int i = X - K + 1; i < X + K; i++) System.out.print(i + " ");
    }
}

