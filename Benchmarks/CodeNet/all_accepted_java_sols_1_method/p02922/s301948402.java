import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sockets = 1;
        int needed = 0;

        while (sockets < B) {
            needed++;
            sockets += A - 1;
        }

        System.out.println(needed);
    }
}