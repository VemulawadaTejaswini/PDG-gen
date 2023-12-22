import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = Integer.parseInt(sc.next());
        int[] S_each = new int[4];
        for (int i = 0; i < S_each.length; i++) {
            S_each[i] = S % 10;
            if (i != 4) {
                S = (S - S_each[i]) / 10;
            }
        }
        boolean check = false;
        for (int i = 0; i < S_each.length - 1; i++) {
            if (S_each[i] == S_each[i + 1]) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.print("Bad");
        } else {
            System.out.print("Good");
        }
        sc.close();
    }
}
