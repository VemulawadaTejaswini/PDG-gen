import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        int start = X - K + 1;
        int end = X + K;
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
    }
}
