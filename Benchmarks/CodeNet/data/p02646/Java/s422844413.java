import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int v = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int w = Integer.parseInt(scanner.next());
        int t = Integer.parseInt(scanner.next()) + 1;
        boolean bool = false;

        for (int i = 0; i < t; i++) {
            int player1 = a + (i * v);
            int player2 = b + (i * w);
            if(player1 == player2) {
                bool = true;
            }
        }

        if(bool) System.out.println("YES");
        if(!bool) System.out.println("NO");
    }
}