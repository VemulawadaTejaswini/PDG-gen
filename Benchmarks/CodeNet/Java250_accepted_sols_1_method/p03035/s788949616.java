import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.printf("%d\n", (a >= 13) ? b : (a >= 6) ? b / 2 : 0);
    }
}
