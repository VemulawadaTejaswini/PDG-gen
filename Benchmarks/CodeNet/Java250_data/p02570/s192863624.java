import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        if (S * T >= D) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
