import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        for (int i = 0; i <= X; i++) {
            for (int j = X; j >= 0; j--) {
                if (i + j == X && 2 * i + 4 * j == Y) {
                    System.out.println("Yes");
                    return;}}}
                System.out.println("No");

    }





    public static void main(String[] args) {
        new Main().solve();
    }
    }