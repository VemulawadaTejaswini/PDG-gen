import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        int a = Integer.parseInt(in.split(" ")[0]);
        int b = Integer.parseInt(in.split(" ")[1]);

        if (a > 9 || a < 1 || b < 1 || b > 9) {
            System.out.println(-1);
        } else {
            System.out.println(a*b);
        }
    }
}
