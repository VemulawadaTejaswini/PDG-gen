import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int x = Integer.parseInt(sc.nextLine().split(" ")[0]);
        int count = 1;
        int arg = x;
        while (true) {
            if (arg % 360 == 0) {
                break;
            }
            arg += x;
            count++;
        }
        System.out.println(count);
    }
}
