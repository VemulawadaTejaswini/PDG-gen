import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        if (Math.min(A,B) <= C && Math.max(A,B) >= C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}