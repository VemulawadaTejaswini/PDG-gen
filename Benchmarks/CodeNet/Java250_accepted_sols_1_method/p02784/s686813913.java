import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int atk = 0;
        for (int i = 0; i < n; i++) {
            atk += Integer.parseInt(sc.next());
        }
        if (hp <= atk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
