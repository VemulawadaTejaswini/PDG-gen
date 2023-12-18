import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int ans = 0;
        ans = x / 500;
        if (ans == 0) {
            System.out.println((x / 5) * 5);
        } else {
            x %= 500;
            System.out.println(ans * 1000 + (x / 5) * 5);
        }
    }
}
