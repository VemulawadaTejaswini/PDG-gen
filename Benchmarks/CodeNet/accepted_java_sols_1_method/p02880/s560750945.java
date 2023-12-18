import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        int n = Integer.parseInt(in.split(" ")[0]);

        for (int i = 1; i <= 9; i++) {
            for (int o = 1; o <= 9; o++) {
                if (i * o == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
