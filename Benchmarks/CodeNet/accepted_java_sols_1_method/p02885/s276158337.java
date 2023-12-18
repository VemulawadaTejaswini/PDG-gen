import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int diff = A - 2 * B;
        System.out.println(Math.max(diff, 0));
    }
}