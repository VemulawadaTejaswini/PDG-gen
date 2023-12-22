import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        int t_h = Integer.parseInt(arr[0]);
        int t_s = Integer.parseInt(arr[1]);
        int a_h = Integer.parseInt(arr[2]);
        int a_s = Integer.parseInt(arr[3]);

        boolean t_turn = true;

        while (t_h > 0 && a_h > 0) {
            if (t_turn) {
                a_h -= t_s;
            } else {
                t_h -= a_s;
            }
            t_turn = !t_turn;
        }

        if (t_h > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}